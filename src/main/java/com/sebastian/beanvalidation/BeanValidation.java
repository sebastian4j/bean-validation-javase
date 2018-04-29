package com.sebastian.beanvalidation;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.Validation;

/**
 *
 * @author sebastian
 */
public class BeanValidation {
    public static void main(String[] args) {        
        
        var p = new Persona();
        p.setEdad(-1);
        p.setNombre(null);
        p.setEmail("sebastian4j");
        validar(p);
    }
    private static void validar(final Object t) {
        System.out.println("_____");
        var vld = Validation.buildDefaultValidatorFactory().getValidator();
        var v = vld.validate(t);
        v.stream().forEach(cv -> System.out.println(cv.getPropertyPath() + ": " + cv.getMessage()));
    }
}
package com.sebastian.beanvalidation;

import java.util.function.Consumer;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;

/**
 *
 * @author sebastian
 */
public class BeanValidation {
    public static void main(String[] args) {        
        var vld = Validation.buildDefaultValidatorFactory().getValidator();
        var p = new Persona();
        p.setEdad(-1);
        p.setNombre(null);
        p.setEmail("sebastian4j");
        var v = vld.validate(p);
        v.stream().forEach(cv -> System.out.println(cv.getPropertyPath() + ": " + cv.getMessage()));
    }
}
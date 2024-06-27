package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MinandMaxParts implements ConstraintValidator<ValidMinAndMax, Part> {
    @Override
    public void initialize(ValidMinAndMax constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(part.getMax() < part.getInv() || part.getMin() > part.getInv()){
            return false;
        } else{
            return true;
        }
    }
}
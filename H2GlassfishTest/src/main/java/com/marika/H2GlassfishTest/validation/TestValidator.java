package com.marika.H2GlassfishTest.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.marika.H2GlassfishTest.model.Test;

public class TestValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Test.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//Test test = (Test) target;
		
		//Integer userID = test.getUserId();
		//String userName = test.getUserName();
		
		ValidationUtils.rejectIfEmpty(errors, "userId", "test.userId.empty");
		ValidationUtils.rejectIfEmpty(errors, "userName", "test.userName.empty");
		
	}

}

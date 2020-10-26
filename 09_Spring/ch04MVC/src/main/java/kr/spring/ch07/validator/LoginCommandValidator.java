package kr.spring.ch07.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import kr.spring.ch07.model.LoginCommand;

public class LoginCommandValidator implements Validator {

	//자바빈인지 검증
	@Override
	public boolean supports(Class<?> clazz) {
		
		return LoginCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//비어있거나 공백이 있으면 reject
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required");	//Errors객체, 필드, 에러 코드
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required");
	}

}
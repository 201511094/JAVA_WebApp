package kr.spring.board.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import kr.spring.board.vo.BoardCommand;

public class BoardValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return BoardCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "writer", "required");
		ValidationUtils.rejectIfEmpty(errors, "title", "required");
		ValidationUtils.rejectIfEmpty(errors, "passwd", "required");
		ValidationUtils.rejectIfEmpty(errors, "content", "required");
	}
	
}
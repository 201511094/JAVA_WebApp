package kr.spring.ch08.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import kr.spring.ch08.model.SubmitReportVO;

public class SubmitReportValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return SubmitReportVO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "subject", "required");
		
		SubmitReportVO command = (SubmitReportVO)target;
		//객체가 만들어지지 않았거나 파일에 대한 정보가 없는 경우
		if (command.getReportFile() == null || command.getReportFile().isEmpty()) {
			errors.rejectValue("reportFile", "required");
		}
		
	}

}
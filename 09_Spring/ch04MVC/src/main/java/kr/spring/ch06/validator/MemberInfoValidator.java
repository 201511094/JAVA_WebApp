package kr.spring.ch06.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import kr.spring.ch06.model.MemberInfo;

public class MemberInfoValidator implements Validator {

	//Validator가 검증할 수 있는 타입인지 검사
	@Override
	public boolean supports(Class<?> clazz) {
		//MemberInfo가 자바빈인지 검사
		return MemberInfo.class.isAssignableFrom(clazz);
	}

	//target객체에 대한 검증
	//검증 결과 문제가 있을 경우 errors객체에 어떤 문제인지에 대한 정보를 저장
	@Override
	public void validate(Object target, Errors errors) {
		MemberInfo memberInfo = (MemberInfo)target;	//다운캐스팅
		//id가 null이거나 빈 문자열인 경우
		if (memberInfo.getId() == null || memberInfo.getId().trim().isEmpty()) {
			errors.rejectValue("id", "required");	//자바빈의 필드, 에러코드
		}
		if (memberInfo.getName() == null || memberInfo.getName().trim().isEmpty()) {
			errors.rejectValue("name", "required");
		}
		if (memberInfo.getZipcode() == null || memberInfo.getZipcode().trim().isEmpty()) {
			errors.rejectValue("zipcode", "required");
		}
		if (memberInfo.getAddress1() == null || memberInfo.getAddress1().trim().isEmpty()) {
			errors.rejectValue("address1", "required");
		}
		if (memberInfo.getAddress2() == null || memberInfo.getAddress2().trim().isEmpty()) {
			errors.rejectValue("address2", "required");
		}
	}

}
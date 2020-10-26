package kr.spring.ch08.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.spring.ch08.model.SubmitReportVO;
import kr.spring.ch08.validator.SubmitReportValidator;

@Controller
@RequestMapping("/report/submitReport.do")
public class SubmitReportController {
	
	//파일 업로드 경로 읽기, file.properties파일의 file_path의 정보를 읽어옴
	@Value("${file_path}")
	private String path;
	
	//자바빈(VO) 초기화 -> 유효성 체크를 위해 반드시 자바빈 초기화가 필요
	@ModelAttribute("report")
	public SubmitReportVO initCommand() {
		
		return new SubmitReportVO();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		
		return "report/submitReportForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("report") SubmitReportVO vo, BindingResult result) throws IOException {
		
		//전송된 데이터 유효성 체크
		new SubmitReportValidator().validate(vo, result);
		
		//유효셩 체크 결과 오류가 있으면 폼 호출
		if (result.hasErrors()) {
			
			return form();
		}
		
		//업로드 경로 정보를 갖는 File객체 생성
		File file = new File(path + "/" + vo.getReportFile().getOriginalFilename());
		vo.getReportFile().transferTo(file);	//경로 옮겨주기
		
		//파일 정보를 콘솔에 출력
		System.out.println("주제: " + vo.getSubject());
		System.out.println("업로드한 파일: " + vo.getReportFile().getOriginalFilename());
		System.out.println("소스 코드 크기: " + vo.getReportFile().getSize());
		
		return "report/submittedReport";
	}
	
}
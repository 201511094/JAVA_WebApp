package kr.spring.ch04;

public class WriteArticleService {
	private WriteArticleDAO writeArticleDAO;
	
	public WriteArticleService(WriteArticleDAO writeArticleDAO) {
		this.writeArticleDAO = writeArticleDAO;
	}
	
	public void write() {
		System.out.println("WriteArticleService의 write() 메소드 실행");
		
		writeArticleDAO.insert();
		
	}
}
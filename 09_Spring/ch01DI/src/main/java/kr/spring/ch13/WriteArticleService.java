package kr.spring.ch13;

public class WriteArticleService {
	//프로퍼티
	private WriteArticleDAO writeArticleDAO;

	public void setWriteArticleDAO(WriteArticleDAO writeArticleDAO) {
		this.writeArticleDAO = writeArticleDAO;
	}
	
	public void write() {
		System.out.println("WriteArticleService의 write() 메소드 실행");
		writeArticleDAO.insert();
	}
	
}
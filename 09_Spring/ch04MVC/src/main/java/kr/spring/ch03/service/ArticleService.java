package kr.spring.ch03.service;

import kr.spring.ch03.model.NewArticleCommand;

public class ArticleService {
	public void writeArticle(NewArticleCommand command) {
		System.out.println("게시글 처리 완료: "+command);
	}
}
package kr.spring.ch05.model;

//자바빈 역할
public class SearchCommand {
	private String type;
	private String query;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	
}
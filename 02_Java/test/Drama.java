
public class Drama {
	private String title;
	private String actor;
	private String actress;
	
	public Drama(String title, String actor, String actress) {
		this.title=title;
		this.actor=actor;
		this.actress=actress;
	}
	
	public String toString() {
		StringBuffer sb=new StringBuffer();
		//title, actor, actree문자열을 조합하여 리턴
		return sb.append(title).append(actor).append(actress).toString();
	}
	
	public static void main(String[] args) {
		Drama drama=new Drama("직장의 신", "김혜수", "오지호");
	}
}
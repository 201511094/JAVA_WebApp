package package_exam04;

public interface DataAccessObject {
//	public void select();
//	public void insert();
//	public void update();
//	public void delete();
	
	public default void select() {
		System.out.println("DB에서 검색");
	}
	public default void insert() {
		System.out.println("DB에서 삽입");
	}
 	public default void update() {
 		System.out.println("DB에서 수정");
 	}
	public default void delete() {
		System.out.println("DB에서 삭제");
	}
	
}
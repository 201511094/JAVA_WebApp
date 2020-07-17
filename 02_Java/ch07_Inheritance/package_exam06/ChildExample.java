package package_exam06;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
	}
}

//생성자 호출 순서 정리
//1. Child객체 생성 -> Child()로 이동
//2. this 수행 전에 부모인 Parent()로 이동
//3. this("대한민국")를 통해 Parent(String nation)으로 이동
//4. "Parent(String nation)" 출력하고 Parent()로 돌아가기
//5. 돌아와서 "Parent() call" 출력하고 Child()로 돌아가기
//6. this("kjh")를 통해 child(String name)으로 이동
//7. "Child(String name)" 출력하고 Child()로 돌아가기
//8. 돌아와서 "Child() call" 출력하고 완료
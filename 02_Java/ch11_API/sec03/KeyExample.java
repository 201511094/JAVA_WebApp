package sec03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Key��ü�� �ĺ�Ű�� ����ؼ� String���� �����ϴ� HashMap��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//�ĺ�Ű "new Key(1)"�� "kjh"�� ������
		hashMap.put(new Key(1), "kjh");
		
		//�ĺ�Ű "new Key(1)" �� "kjh"�� �о��
		String value  = hashMap.get(new Key(1));
		System.out.println(value);
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}
}
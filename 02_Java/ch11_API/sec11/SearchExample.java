package sec11;

import java.util.Arrays;

public class SearchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//binarySearch(�迭, ã�� ��)
		//�⺻ Ÿ�԰� �˻�
		int[] scores= {99,97,98};
		Arrays.sort(scores);
		int idx=Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: "+idx);
		
		//���ڿ� �˻�
		String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };
		Arrays.sort(names);
		idx=Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε���: "+idx);
		
		//��ü �˻�
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);
		idx=Arrays.binarySearch(members, m1);
		System.out.println("ã�� �ε���: "+idx);
		
	}
}
package sec03;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {	//�Ű��� Ÿ�� Ȯ��
			Member member = (Member) obj;	//���� Ÿ�� ��ȯ
			if (id.equals(member.id)) {	//id�ʵ尪�� �������� �˻�
				return true;
			}
		}
		
		return false;
	}
	
	//hashCode() �������̵�
	//id�� ������ ���ڿ��� ��� ���� �ؽ� �ڵ带 ����
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
}
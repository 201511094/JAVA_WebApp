
public class Computer {
	//�޼ҵ��� �Ű����� ���� �� ���
	int sum1(int[] values) {	//�迭�� �Ѱ���
		int sum=0;
		for (int i=0;i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {	//'...'�� ����� �Ű������� �迭Ÿ��, �迭���� ���� ����Ʈ�� �Ѱ���
		int sum=0;
		for (int i=0;i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
package package_8;

public class PrimeNumber {
//	�Ҽ��� ���� : 1�� �ڱ� �ڽŸ����� ������ �������� 1���� ū ���� ����.
	
	public static void main(String[] args) {
		
		int num  = 19;
		
		boolean flag = true;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("�Է¹��� "+num+"�� �Ҽ��Դϴ�.");
		}
		else {
			System.out.println("�Է¹��� "+num+"�� �Ҽ��� �ƴմϴ�.");
		}
		
	}
}



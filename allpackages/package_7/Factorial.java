package package_7;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 6;
		int cal = 1;
		
		for(int i=1; i<=num; i++) {
			cal *= i;
		}
		System.out.println("�Է¹��� ���丮�� ����: "+cal);
		
		cal = 1; // cal �ʱ�ȭ
		
		for(int i=num; i>=1; i--) {
			cal *= i;
		}
		System.out.println("�Է¹��� ���丮�� ����: "+cal);
	}
}



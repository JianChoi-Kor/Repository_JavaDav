package package_7;

public class Factorial {

	public static void main(String[] args) {
		
		int num = 6;
		int cal = 1;
		
		for(int i=1; i<=num; i++) {
			cal *= i;
		}
		System.out.println("입력받은 팩토리얼 값은: "+cal);
		
		cal = 1; // cal 초기화
		
		for(int i=num; i>=1; i--) {
			cal *= i;
		}
		System.out.println("입력받은 팩토리얼 값은: "+cal);
	}
}



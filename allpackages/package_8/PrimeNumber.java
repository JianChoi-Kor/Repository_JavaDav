package package_8;

public class PrimeNumber {
//	소수의 정의 : 1과 자기 자신만으로 나누어 떨어지는 1보다 큰 양의 정수.
	
	public static void main(String[] args) {
		
		int num  = 19;
		
		boolean flag = true;
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("입력받은 "+num+"은 소수입니다.");
		}
		else {
			System.out.println("입력받은 "+num+"은 소수가 아닙니다.");
		}
		
	}
}



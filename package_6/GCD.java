package package_6;

public class GCD {

	public static void main(String[] args) {
		
		int inputNum1, inputNum2;
		inputNum1 = 18;
		inputNum2 = 27;
		
		int big;
		int small;
		
		if(inputNum1 > inputNum2) {
			big = inputNum1;
			small = inputNum2;
		}
		else {
			big = inputNum2;
			small = inputNum1;
		}
		
		int gcd = 1;
		
		for(int i=1; i<=small; i++) {
			if(big % i == 0 && small % i == 0) {
				gcd = i;
			}
		}
		System.out.println("두 수 "+big+", "+small+"의 "+"최대 공약수는: "+gcd);
	}
}


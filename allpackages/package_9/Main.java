package package_9;

public class Main {

	public static void main(String[] args) {
		
		int num = 22847;
		int accsum = 0;
		
		while(num > 0) {
			accsum += num % 10;
			num /= 10;
		}
		System.out.println(accsum);
	}
}




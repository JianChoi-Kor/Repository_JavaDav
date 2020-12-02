package package_10;

public class Rec1 {

	public static void main(String[] args) {
		
		int num = 6;
		
		for(int i=1; i<=num*num; i++) {
			System.out.printf("%4d",i);
			if(i%num == 0) {
				System.out.println();
			}
		}
	}
}




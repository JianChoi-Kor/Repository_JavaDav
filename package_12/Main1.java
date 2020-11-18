package package_12;

public class Main1 {

	public static void main(String[] args) {

		 System.out.println(add(50, 20));
		 
		 System.out.println(add(50, 40, 30));
		 
		 System.out.println(add(1, 2, 3, 4, 5));
	}
	
	public static int add(int x, int y) {
		return x+y; 
	}
	
	public static int add(int x, int y, int z) {
		return x+y+z;
	}
	
	public static int add(int ... numbers) {
		int sum = 0;
		for(int i=0; i < numbers.length; i++) {
			sum = sum + i;
		}
		return sum;
	}

}

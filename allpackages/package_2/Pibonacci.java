package package_2;

public class Pibonacci {

	public static void main(String[] args) {
		
		int [] arr = new int[10];
		
		//An = An-1 + An-2     n>=3
		//A1 = 1, A2 = 1
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<10; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i=1; i<=9; i++) {
			System.out.println(arr[i] + " ");
		}
		
		
	}
}


package Study;

public class MethodStar1 {

	public static void main(String[] args) {
		
		printStar(5);
		
		System.out.println("\n"+"\n"+"----------------------"+"\n");
		
		printStarSquare(5);

	}
	
	public static void printStar(int n) {
		for(int i=0; i<n; i++) {
			System.out.print("* ");
		}
	}

	public static void printStarSquare(int n) {
		for(int i=0; i<n; i++) {
			printStar(n);
			System.out.println();
		}
	}
}



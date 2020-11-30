package Study;

public class MethodStar2 {

	public static void main(String[] args) {
		
		printStarTri(6);
		
		System.out.println("\n"+"----------------"+"\n");
		

		printStarReTri(6);
	}
	
	public static void printStar(int n) {
		for(int i=0; i<n; i++) {
			System.out.print("* ");
		}
	}
	
	public static void printStarTri(int n) {
		for(int i=0; i<n; i++) {
			printStar(i+1);
			System.out.println();
		}
	}
	
	public static void printStarReTri(int n) {
		for(int i=n; i>0; i--) {
			printStar(i);
			System.out.println();
		}
	}
}




package Study;

public class MethodStar3 {

	public static void main(String[] args) {

		printStarShape(5, "# ");
		
		System.out.println("\n"+"\n"+"-----------"+"\n");
		
		printStarReTri2(5);
	}
	
	public static void printStarShape(int n, String shape) {
		for(int i=0; i<n; i++) {
			System.out.print(shape);
		}
	}
	
	public static void printStarReTri2(int n) {
		for(int i=0; i<n; i++) {
			int star = i+1;
			int empty = n-star;
			
			printStarShape(empty, "  ");
			printStarShape(star, "* ");
			
			System.out.println();
		}
	}
}



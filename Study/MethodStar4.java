package Study;

public class MethodStar4 {

	public static void main(String[] args) {


		printStarLattice(5);

	}
	
	public static void printStarShape(int n, String shape) {
		for(int i=0; i<n; i++) {
			System.out.print(shape);
		}
	}
	

	public static void printStarLattice(int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				if(i%2 == 0) {
					if(j%2 == 0) {
						printStarShape(1, "*");
					}
					else {
						printStarShape(1, " ");
					}
				}	
				else {
					if(j%2 == 0) {
						printStarShape(1, " ");
					}
					else {
						printStarShape(1, "*");
					}
				}
			}
			System.out.println();
		}
	}
}



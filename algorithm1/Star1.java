package algorithm1;

public class Star1 {

	public static void main(String[] args) {
		
		int s = 7;
		
		for(int i=0; i<s; i++) {
			for(int j=s; j>0; j--) {
				
				if(i>j-2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		

	}

}

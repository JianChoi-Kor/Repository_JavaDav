package package_10;

public class Rec3 {

	public static void main(String[] args) {

		int n = 6;
		
		int arr[][] = new int[n][n];

		
		for(int i=0; i<n; i++) {
			
			if(i % 2 == 0) {
				for(int j=0; j<n; j++) {
					arr[i][j] = i*n +j+1;
				}
			}
			else {
				for(int j=0; j<n; j++) {
					arr[i][j] = i*n+n-j;
				}
			}
		}


		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}

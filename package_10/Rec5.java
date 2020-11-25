package package_10;

public class Rec5 {

	public static void main(String[] args) {
		
		int n = 5;
		int[][] arr = new int[n][n];

		int a = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[j][i] = a;
				a++;
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



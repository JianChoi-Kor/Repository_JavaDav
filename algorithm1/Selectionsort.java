package algorithm1;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {

		int[] intArr = {9, 6, 7, 3, 5};
		
//		int n = 0;
//		
//		while(n < intArr.length) {
//
//			for(int i=n; i<intArr.length; i++) {
//				
//				int min = intArr[n];
//				
//				if(intArr[i] < min) {
//					min = intArr[i];
//					
//					int temp = intArr[n];
//					intArr[n] = min;
//					intArr[i] = temp;
//				}
//			}
//			n++;
//			System.out.println(Arrays.toString(intArr));
//		}
		
		
		for(int n=0; n<intArr.length-1; n++) {

			for(int i=n; i<intArr.length; i++) {
				
				int min = intArr[n];
				
				if(intArr[i] < min) {
					min = intArr[i];
					
					int temp = intArr[n];
					intArr[n] = min;
					intArr[i] = temp;
				}
			}

			System.out.println(Arrays.toString(intArr));
		}


		
		
	}

}

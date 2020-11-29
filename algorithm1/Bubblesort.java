package algorithm1;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		
		int[] arr = {7, 4, 5, 1, 3};
		
		for(int i=arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}	
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}



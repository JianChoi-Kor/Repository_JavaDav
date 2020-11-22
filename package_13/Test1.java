package package_13;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		int count=0;
		int[] arr = new int[30];
		
//		0~29
		
		for(int i=0; i<arr.length/3; i++) {
			for(int j=1; j<=3; j++) {
				arr[count] = j;
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}



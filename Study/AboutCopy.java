package Study;

import java.util.Arrays;

public class AboutCopy {

	public static void main(String[] args) {
		
		int[] arr = {4, 7, 1, 9, 3};
		
		// 얕은 복사
		int[] arr2 = arr;
		
		
		// 깊은 복사
		int[] arr3 = copyArr(arr);
		
		orderBy(arr3);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr3));
	}
	
	public static void orderBy(int[] arr) {
		Arrays.sort(arr);
	}
	
	public static int[] copyArr(int[] arr) {
		
		int[] oArr = new int[arr.length];
		
		for(int i=0; i<oArr.length; i++) {
			oArr[i] = arr[i];
		}
		return oArr;
	}
}




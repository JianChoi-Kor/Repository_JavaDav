package algorithm1;

public class Selectionsort_basic {
	
	public static int maxValue(int[] arr) {
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			// arr[i]가 max 보다 클 경우 max에 arr[i] 값을 넣고 i++하여 for문을 다시 진행한다.
		}
		return max;		
	}
	
	public static int minValue(int[] arr) {
		
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
		// arr[i]가 min 보다 작을 경우 min에 arr[i] 값을 넣고 i++하여 for문을 다시 진행한다.
	}

	
	public static void main(String[] args) {
		
		int[] intArr = {9, 6, 7, 3, 5};
		
		System.out.println("최솟값 : "+minValue(intArr));
		System.out.println("최댓값 : "+maxValue(intArr));
	}
}






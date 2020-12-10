package Study.arraylistalgorithm;

public class MyArrayList {
	
	private int[] arr = new int [0];
	
	
	public int[] getArr() {
		return arr;
	}


	public void add(int val) {
		
		int[] temp = new int[arr.length+1];
		
		temp[arr.length] = val;
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	
	
	public void add(int num, int val) {
		
		int[] temp = new int[arr.length+1];
		
		temp[num] = val;
		
		for(int i=0; i<arr.length; i++) {
			if(i < num) {
				temp[i] = arr[i];
			} else {
				temp[i+1] = arr[i];
			}
		}
		arr = temp;
	}
	
	
	public int remove(int num) {
		int a = arr[num];
		
		int[] temp = new int[arr.length-1];
		
		for(int i=0; i<temp.length; i++) {
			if(i < num) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i+1];
			}
		}
		arr = temp;
		
		
		return a;
	}
	
	
	
	
	
	
	public int get(int idx) {
		
		return arr[idx];
	}
}






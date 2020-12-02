package package_14;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] array = {1, 5, 2, 6, 3, 7, 4}; 

		
		int i, j, k, l;
		
		i=2;
		j=5;
		k=3;
		
		Arrays.sort(array, i, j);
		
		System.out.println(Arrays.toString(array));
		
		l = array[k];
		
		System.out.println(l);
	}
}



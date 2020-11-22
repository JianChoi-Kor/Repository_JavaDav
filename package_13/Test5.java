package package_13;

import java.util.Arrays;

public class Test5 {


	public static void main(String[] args) {
	
		int[] answer = new int[21];
		int[] answer1 = new int[answer.length];
		
		int[] st1 = {1, 2, 3, 4, 5};
		int count1 = 0;
		
		while(count1 < answer1.length) {
			answer1[count1] = st1[count1%st1.length];
			count1++;
		}

		System.out.println(Arrays.toString(answer1));
		
	}
}



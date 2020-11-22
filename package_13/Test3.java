package package_13;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		
		int[] answer1 = new int[40];
		int[] answer2 = new int[40];
		int[] answer3 = new int[40];
		
		int[] st1 = {1, 2, 3, 4, 5};
		int count1 = 0;
		
		for(int i=0; i<answer1.length/st1.length; i++) {
			for(int j=0; j<st1.length; j++) {
				answer1[count1] = st1[j];
				count1++;
			}
		}
		
		int[] st2 = {2, 1, 2, 3, 4, 2, 5, 2};
		int count2 = 0;
		
		for(int i=0; i<answer2.length/st2.length; i++) {
			for(int j=0; j<st2.length; j++) {
				answer2[count2] = st2[j];
				count2++;
			}
		}
		
		int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int count3 = 0;
		
		for(int i=0; i<answer3.length/st3.length; i++) {
			for(int j=0; j<st3.length; j++) {
				answer3[count3] = st3[j];
				count3++;
			}
		}
		
		System.out.println(Arrays.toString(answer1));
		System.out.println(Arrays.toString(answer2));
		System.out.println(Arrays.toString(answer3));
	}
}








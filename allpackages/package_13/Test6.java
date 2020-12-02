package package_13;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		
		int[] answer1 = new int[20];
		int[] answer2 = new int[20];
		int[] answer3 = new int[20];
		int[] answer = new int[20];
		
		int[] st1 = {1, 2, 3, 4, 5};
		int count1 = 0;
		
		for(int i=0; i<answer.length/st1.length; i++) {
			for(int j=0; j<st1.length; j++) {
				answer1[count1] = st1[j];
				count1++;
			}
		}
		count1=0;

		
		
		int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int count2 = 0;
		
		for(int i=0; i<answer.length/st2.length; i++) {
			for(int j=0; j<st2.length; j++) {
				answer2[count2] = st2[j];
				count2++;
			}
		}
		count2=0;

		
		
		int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int count3 = 0;
		
		for(int i=0; i<answer3.length/st3.length; i++) {
			for(int j=0; j<st3.length; j++) {
				answer3[count3] = st3[j];
				count3++;
			}
		}
		count3=0;
		

		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)(Math.random()*5)+1;
		}
		
		
		
		System.out.println(Arrays.toString(answer));
		System.out.println(Arrays.toString(answer1));
		System.out.println(Arrays.toString(answer2));
		System.out.println(Arrays.toString(answer3));
		
		
		for(int i=0; i<answer.length; i++) {
			if(answer1[i] == answer[i]) {
				count1++;
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			if(answer2[i] == answer[i]) {
				count2++;
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			if(answer3[i] == answer[i]) {
				count3++;
			}
		}
		
		int[] num = {count1, count2, count3};
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);

	}
}








package package_13;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		
		int[] answer = new int[10];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = (int)(Math.random()*5)+1;
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		
	}

}

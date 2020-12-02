package algorithm1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int n = 421314218;
		int length = (int)(Math.log10(n)+1);
		
		int[] num = new int[length];

		int i = 0;
		
		int[] answer = new int[10];
		
		while(n>0) {
			num[i] = n%10;
			n = n/10;
			answer[num[i]]++;
			i++;
		}

		for(int j=0; j<10; j++) {
			System.out.println(j+" : "+answer[j]);
		}
		
		System.out.println(i);
	}
}





package algorithm1;

import java.util.Scanner;

public class Multip2 {

	public static void main(String[] args) {
		
		int s = 2;
		int f = 6;
		
		for(int i=1; i<10; i++) {
			for(int dan = s; dan < f; dan++) {
				System.out.printf("%4d * %2d = %3d", dan, i, dan*i);
			}
			System.out.println();
		}
	}

}

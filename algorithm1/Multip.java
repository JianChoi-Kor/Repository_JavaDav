package algorithm1;

import java.util.Scanner;

public class Multip {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 단부터 몇 단까지 출력할까요?");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		for(int i=n1; i<=n2; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+ i*j);
			}
			System.out.println();
		}	
	}

}

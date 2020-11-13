package package_2;

import java.util.Scanner;

public class Pivonacci_R {

	public static void main(String[] args) {

		int[] arr = new int[100];
		
		arr[1]= 1;
		arr[2]= 1;
		
		Scanner scan = new Scanner(System.in);
		String input;
		int n;
		
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println("프로그램을 시작합니다.");
			System.out.println("피보나치 수열을 출력하시려면 y, 종료를 원하시면 n");
			
			input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("몇번째 피보나치 수열까지 출력할까요? (3이상 100이하 출력 가능)");
				
				n = scan.nextInt();
				
				for(int i=3; i<=n; i++) {
					arr[i] = arr[i-1] + arr[i-2];
				}
				
				for(int i=1; i<=n; i++) {
					System.out.print(arr[i]+" ");
				}
				
			}
			else if(input.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}



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
			System.out.println("���α׷��� �����մϴ�.");
			System.out.println("�Ǻ���ġ ������ ����Ͻ÷��� y, ���Ḧ ���Ͻø� n");
			
			input = scan.next();
			
			if(input.equals("y")) {
				System.out.println("���° �Ǻ���ġ �������� ����ұ��? (3�̻� 100���� ��� ����)");
				
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
		System.out.println("���α׷��� �����մϴ�.");
	}
}



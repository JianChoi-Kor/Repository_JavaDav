package package_3;

import java.util.Scanner;

public class Mode1 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ֺ�� ���ϱ�, 1~9 ������ ���� 10���� �Է����ּ���.");
		for(int i=0; i<10; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("�Է¹��� ���� 10���� �Ʒ��� �����ϴ�.");
		
		for(int i=0; i<10; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		int[] mode = new int[10];

		for(int i=1; i<10; i++) {
			mode[arr[i]]++; 
		}
		
		int modeNum = 0;   //   ���� �ֺ��
		int modeCnt = 0;   //   �ֺ���� ���� Ƚ��
		
		for(int i=1; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println();
		System.out.println("�ֺ���� : "+modeNum+" cnt:"+modeCnt);

	}

}

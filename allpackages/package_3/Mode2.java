package package_3;

import java.util.Scanner;

public class Mode2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] inputNum = new int[10];
		
		System.out.println("�ֺ�� ���ϱ�, 1~9 ������ ���� 10���� �Է����ּ���.");
		
		for(int i=0; i<10; i++) {
			inputNum[i] = scan.nextInt();
		}

		
		System.out.println("\n"+"�Է¹��� ������ �Ʒ��� �����ϴ�.");
		for(int i=0; i<10; i++) {
			System.out.print(inputNum[i]+" ");
		}
		
		int[] mode = new int[10];
		
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++;
		}
		
		int modeNum = 0;
		int modeCnt = 0;
		
		for(int i=0; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("\n"+"\n"+"�ֺ���� : "+modeNum+ " Cnt�� : "+modeCnt);
		
	}

}

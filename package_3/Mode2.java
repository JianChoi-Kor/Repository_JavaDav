package package_3;

import java.util.Scanner;

public class Mode2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] inputNum = new int[10];
		
		System.out.println("최빈수 구하기, 1~9 사이의 정수 10개를 입력해주세요.");
		
		for(int i=0; i<10; i++) {
			inputNum[i] = scan.nextInt();
		}

		
		System.out.println("\n"+"입력받은 정수는 아래와 같습니다.");
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
		
		System.out.println("\n"+"\n"+"최빈수는 : "+modeNum+ " Cnt는 : "+modeCnt);
		
	}

}

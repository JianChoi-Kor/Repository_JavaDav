package package_3;

import java.util.Scanner;

public class Mode3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] inputNum = new int[10];
		
		System.out.println("최빈수 구하기, 1~9사이의 정수 10개를 입력해주세요.");
		
		for(int i=0; i<10; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		System.out.println("\n"+"입력받은 정수들는 다음과 같습니다.");
		for(int i=0; i<10; i++) {
			System.out.print(inputNum[i]+" ");
		}
		
		int[] mode = new int[10];
		for(int i=0; i<10; i++) {
			mode[inputNum[i]]++;
		}
		
		int modeNum = 0;   //   최빈수
		int modeCnt = 0;   //   최빈수 출현 횟수
		
		for(int i=0; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println("\n"+"\n"+"최빈수는 : "+modeNum+" 출현 횟수는 : "+modeCnt);
	}
}



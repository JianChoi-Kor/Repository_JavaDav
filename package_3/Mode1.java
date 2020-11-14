package package_3;

import java.util.Scanner;

public class Mode1 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("최빈수 구하기, 1~9 사이의 정수 10개를 입력해주세요.");
		for(int i=0; i<10; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("입력받은 정수 10개는 아래와 같습니다.");
		
		for(int i=0; i<10; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		int[] mode = new int[10];

		for(int i=1; i<10; i++) {
			mode[arr[i]]++; 
		}
		
		int modeNum = 0;   //   현재 최빈수
		int modeCnt = 0;   //   최빈수가 나온 횟수
		
		for(int i=1; i<10; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		System.out.println();
		System.out.println("최빈수는 : "+modeNum+" cnt:"+modeCnt);

	}

}

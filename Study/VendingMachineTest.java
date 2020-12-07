package Study;

import java.util.Scanner;

public class VendingMachineTest {

	public static void main(String[] args) {
		
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈"};
		int [] priceArr = {500, 600, 700, 800};
		
		System.out.println("-- 메뉴 --");
		
		for(int i=0; i<nmArr.length; i++) {
			System.out.printf("%d. %s - (%d)\n", i+1, nmArr[i], priceArr[i]);
		}
		
		Scanner scn = new Scanner(System.in);
		
		int account = 0;
		
		while(true) {
			System.out.println("메뉴선택 (0:종료) > ");
			int select = scn.nextInt();
			
			if(select == 0) {
				System.out.println("자판기 프로그램을 종료합니다.");
				break;
			}
			else if(select > nmArr.length || select < 0) {
				System.out.println("입력이 잘못 되었습니다. 다시 입력해 주세요.");
				
			}
			else {
				System.out.println(nmArr[select-1]+"을 선택하셨습니다.");
				account += priceArr[select-1];
			}

		}
		System.out.println("총 구매금액 : "+account);
	}
}



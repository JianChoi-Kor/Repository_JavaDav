package Study;

import java.util.Scanner;

public class VendingMachine {
	
	private Can[] canArr;
	private int sum;
	
	Scanner scan = new Scanner(System.in);
	
	public VendingMachine() {
		init();
//		canArr 0~3까지 생성
		
		showMenus(canArr);
		System.out.println();
		
		sum = purchase(canArr, scan);
		System.out.printf("총 합계 금액은 %d원 입니다.\n", sum);

	}
	
	public void init() {
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈"};
		int [] priceArr = {500, 600, 700, 800};
		
		canArr = new Can[nmArr.length];
		
		for(int i=0; i<nmArr.length; i++) {
			canArr[i] = new Can(nmArr[i], priceArr[i]);
		}
	}
	
	public void showMenus(Can[] arr) {
		System.out.println("--- 메뉴 ---");
		for(int i=0; i<canArr.length; i++) {
			System.out.printf("%d. %s는 %d원입니다.\n", i+1, canArr[i].getName(), canArr[i].getPirce());
		}
	}
	
	public int purchase(Can[] arr, Scanner scan) {
		int account = 0;
		
		while(true) {
			
			System.out.println("메뉴 선택 (종료:0) >");
			int select = scan.nextInt();
			
			if(select > arr.length || select < 0) {
				System.out.println("잘못된 값입니다. 다시 입력해주세요.");
				continue;
			}
			else if(select == 0)  {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println(arr[select-1].getName()+"를 선택하셨습니다.");
			account += arr[select-1].getPirce();		
		}

		return account;
	}
	

}

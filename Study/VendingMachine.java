package Study;

import java.util.Scanner;

public class VendingMachine {
	
	private Scanner scan;
	private Can[] canArr;
	private int myMoney;
	private int sum;
	private int[] stock;
	
	public void setCanArr(Can[] canArr) {
		this.canArr = canArr;
	}

	public VendingMachine() {
		init();
	}
	
	public void init() {
		scan = new Scanner(System.in);
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈"};
		int[] priceArr = {500, 600, 700, 800};
		int[] stockArr = {3, 2, 2, 1, 1};
		
		canArr = new Can[nmArr.length];
		stock = new int[stockArr.length];
		
		for(int i=0; i<nmArr.length; i++) {
			canArr[i] = new Can(nmArr[i], priceArr[i], stockArr[i]);
		}
		for(int i=0; i<nmArr.length; i++) {
			stock[i] = stockArr[i];
		}
	}
	
	public boolean inputMoney() {
		
		boolean flag = true;
		System.out.print("얼마를 넣으시겠습니까? : ");
		myMoney = scan.nextInt();
		
		if(myMoney < canArr[0].getPrice()) {
			System.out.printf("넣은 금액이 최소 가격보다 적습니다. 금액 %d원을 반환합니다.\n", myMoney);
			flag = false;
		}
		System.out.println();
		return flag;
	}
	
	public void showMenus() {
		System.out.println("-- 메뉴 --");
		for(int i = 0; i < canArr.length; i++) {
			System.out.printf("%d. %s - (%d원)\n", i+1, canArr[i].getName(), canArr[i].getPrice());
		}
		System.out.println();
	}
	

	public void purchase() {
		
		while(true) {
			System.out.print("메뉴선택 (0:종료, 99:관리자 메뉴) > ");
			int selectNum = scan.nextInt();
			
			if(selectNum == 99) {
				System.out.println();
				for(int i=0; i<canArr.length; i++) {
					System.out.printf("%s의 남은 재고는 %d개 입니다.\n", canArr[i].getName(), stock[i]);
				}
				System.exit(0);
			}
			
			
			if(selectNum == 0) {
				break;
			}
			
			else if(selectNum > canArr.length+1 || selectNum < 0) {
				System.out.println("잘못 입력하셨습니다."); 
			}
			
			else if(myMoney < canArr[selectNum-1].getPrice()) {
				System.out.println("금액이 모자랍니다.");
				break;
			}
		
			else {
				System.out.printf("%s를 선택하셨습니다.\n", canArr[selectNum-1].getName());
				sum += canArr[selectNum-1].getPrice();
				myMoney -= canArr[selectNum-1].getPrice();
				stock[selectNum-1]--;
			}
		}
	}
	
	public void showAcount() {
		System.out.printf("총 합계는 %d원, 잔액은 %d원 입니다.",sum , myMoney);
	}
}




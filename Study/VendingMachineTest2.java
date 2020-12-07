package Study;

import java.util.Scanner;

public class VendingMachineTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈"};
		int [] priceArr = {500, 600, 700, 800};
		
		showMenus(nmArr, priceArr);		
		
		int sum = purchase(priceArr, scan);
		
		System.out.printf("총 구매금액 : %,d원\n", sum);
		scan.close();
	}
	
	public static void showMenus(String[] str, int[] arr) {
		
		System.out.println("-- 메뉴 --");
		for(int i = 0; i < str.length; i++) {
			System.out.printf("%d. %s - (%d원)\n", i+1, str[i], arr[i]);
		}
		
	}
	
	public static int purchase(int[] arr, Scanner n) {
		
		int account = 0;
	
		while(true) {
			System.out.println("메뉴선택 (0:종료) > ");
			int num = n.nextInt();
			
			if(num == 0) {
				break;
			}
			else if(num > arr.length+1 || num < 0) {
				System.out.println("잘못 입력하셨습니다."); 
			}
			else {
				account += arr[num-1];
			}
		}
		return account;
	}
}



package package_namecard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Namecard> list = new ArrayList<>();
		
		
		System.out.println("--------------------------");
		System.out.println("1. 명함 입력");
		System.out.println("2. 명함 검색");
		System.out.println("3. 종료");
		System.out.println("--------------------------"+"\n");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴를 입력하세요 :");
			
			int input_num = scan.nextInt();
			
			if(input_num == 1) {
				System.out.println("이름을 입력하세요.");
				String input_name = scan.next();
				System.out.println("전화번호를 입력하세요.");
				String input_phoneno = scan.next();
				System.out.println("회사 이름을 입력하세요.");
				String input_componyname = scan.next();
				
				Namecard person = new Namecard(input_name, input_phoneno, input_componyname);
				list.add(person);
			}
			
			
			else if(input_num == 2) {
				System.out.println("검색할 이름을 입력하세요.");
				String search_name = scan.next();
				
				if(search_name.)
				
			}
			
			else {
				break;
			}
			
			
			
			
			
			
		}

		
	}

}



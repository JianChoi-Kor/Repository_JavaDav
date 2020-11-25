package package_namecard;

import java.util.ArrayList;
import java.util.Scanner;

import package_1.Student;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Namecard> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("1. 명함 입력");
		System.out.println("2. 명함 검색");
		System.out.println("3. 종료");
		System.out.println("--------------------------"+"\n");

		while(true) {
			System.out.print("\n"+"메뉴를 입력하세요 : ");
			
			int input_num = scan.nextInt();
			
			if(input_num == 1) {
				System.out.print("이름을 입력하세요 : ");
				String input_name = scan.next();
				System.out.print("전화번호를 입력하세요 : ");
				String input_phoneno = scan.next();
				System.out.print("회사 이름을 입력하세요 : ");
				String input_componyname = scan.next();
				
				Namecard person = new Namecard(input_name, input_phoneno, input_componyname);
				list.add(person);
			}
			
			else if(input_num == 2) {
				System.out.print("검색할 이름을 입력하세요 : ");
				String search_name = scan.next();
				
				for(Namecard n : list) {
					
					if(n.getName().indexOf(search_name) != -1) {
						System.out.print("이름 : "+n.getName()+" /  ");
						System.out.print("전화번호 : "+n.getPhoneno()+" /  ");
						System.out.print("회사이름 : "+n.getComponyname()+"\n");
					}		
				}	
			}
			
			else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}	
	}
}



package package_namecard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Namecard> list = new ArrayList<>();
		
		
		System.out.println("--------------------------");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� �˻�");
		System.out.println("3. ����");
		System.out.println("--------------------------"+"\n");
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("�޴��� �Է��ϼ��� :");
			
			int input_num = scan.nextInt();
			
			if(input_num == 1) {
				System.out.println("�̸��� �Է��ϼ���.");
				String input_name = scan.next();
				System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
				String input_phoneno = scan.next();
				System.out.println("ȸ�� �̸��� �Է��ϼ���.");
				String input_componyname = scan.next();
				
				Namecard person = new Namecard(input_name, input_phoneno, input_componyname);
				list.add(person);
			}
			
			
			else if(input_num == 2) {
				System.out.println("�˻��� �̸��� �Է��ϼ���.");
				String search_name = scan.next();
				
				if(search_name.)
				
			}
			
			else {
				break;
			}
			
			
			
			
			
			
		}

		
	}

}



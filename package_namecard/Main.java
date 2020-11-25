package package_namecard;

import java.util.ArrayList;
import java.util.Scanner;

import package_1.Student;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Namecard> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("--------------------------");
		System.out.println("1. ���� �Է�");
		System.out.println("2. ���� �˻�");
		System.out.println("3. ����");
		System.out.println("--------------------------"+"\n");

		while(true) {
			System.out.print("\n"+"�޴��� �Է��ϼ��� : ");
			
			int input_num = scan.nextInt();
			
			if(input_num == 1) {
				System.out.print("�̸��� �Է��ϼ��� : ");
				String input_name = scan.next();
				System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
				String input_phoneno = scan.next();
				System.out.print("ȸ�� �̸��� �Է��ϼ��� : ");
				String input_componyname = scan.next();
				
				Namecard person = new Namecard(input_name, input_phoneno, input_componyname);
				list.add(person);
			}
			
			else if(input_num == 2) {
				System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
				String search_name = scan.next();
				
				for(Namecard n : list) {
					
					if(n.getName().indexOf(search_name) != -1) {
						System.out.print("�̸� : "+n.getName()+" /  ");
						System.out.print("��ȭ��ȣ : "+n.getPhoneno()+" /  ");
						System.out.print("ȸ���̸� : "+n.getComponyname()+"\n");
					}		
				}	
			}
			
			else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}	
	}
}



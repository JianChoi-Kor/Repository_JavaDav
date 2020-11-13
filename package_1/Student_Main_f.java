package package_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Main_f {

	public static void main(String[] args) {
		
		Student s1 = new Student("����", "1125");
		Student s2 = new Student("����", "2972");
		Student s3 = new Student("���", "4491");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student s : list) {
			System.out.println(s.getName()+" "+s.getNo());
		}
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("��� �˻��� ���Ͻø� y, ���Ḧ ���Ͻø� n");
			
			String input = scan.next();
		
			if(input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				String name = scan.next();
				boolean flag = false;
				
				for(Student s : list) {
					if(s.getName().equals(name)) {
						System.out.println("�л���ȣ��"+s.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
				}
			}
			else if(input.equals("n")) {
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}





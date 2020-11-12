package package_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("����", "1111");
		Student s2 = new Student("���", "2222");
		Student s3 = new Student("����", "3333");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student student : list) {
			System.out.println(student.getName()+" "+student.getNo());
		}
		
		Scanner scan = new Scanner(System.in);

		
		while(true) {
			System.out.println("��� �˻��� ���Ͻø� y, ���Ḧ ���Ͻø� n");
			String input = scan.next();
			
			if (input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				String name = scan.next();
				
				boolean flag = false;
				
				for(Student student : list) {
					if(student.getName().equals(name)) {
						System.out.println("�ش��ϴ� �л��� �й��� : "+student.getNo());
						flag = true;
					}
					
				}
				
				if(!flag) {
					System.out.println("�ش��ϴ� �л� �̸��� �����ϴ�.");
				}
				
				
			}
			else if (input.equals("n")) {
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�. ");
		
		
		
		
		
	}

}

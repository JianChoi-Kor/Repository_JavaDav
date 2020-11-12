package package_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("유비", "1111");
		Student s2 = new Student("장비", "2222");
		Student s3 = new Student("관우", "3333");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student student : list) {
			System.out.println(student.getName()+" "+student.getNo());
		}
		
		Scanner scan = new Scanner(System.in);

		
		while(true) {
			System.out.println("계속 검색을 원하시면 y, 종료를 원하시면 n");
			String input = scan.next();
			
			if (input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = scan.next();
				
				boolean flag = false;
				
				for(Student student : list) {
					if(student.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은 : "+student.getNo());
						flag = true;
					}
					
				}
				
				if(!flag) {
					System.out.println("해당하는 학생 이름이 없습니다.");
				}
				
				
			}
			else if (input.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다. ");
		
		
		
		
		
	}

}

package package_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Main_f {

	public static void main(String[] args) {
		
		Student s1 = new Student("유비", "1125");
		Student s2 = new Student("관우", "2972");
		Student s3 = new Student("장비", "4491");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(Student s : list) {
			System.out.println(s.getName()+" "+s.getNo());
		}
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("계속 검색을 원하시면 y, 종료를 원하시면 n");
			
			String input = scan.next();
		
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = scan.next();
				boolean flag = false;
				
				for(Student s : list) {
					if(s.getName().equals(name)) {
						System.out.println("학생번호는"+s.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
			}
			else if(input.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}





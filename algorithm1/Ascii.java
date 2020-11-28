package algorithm1;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 입력해주세요 : ");
		char alpa = sc.nextLine().charAt(0);
		int ialpa = (int)alpa;
		
		System.out.println(ialpa);

		
		System.out.println("----------------");
		

		//아스키코드 변환하는 방법
		int a = 0;
		String b = "5";
		
		a = b.charAt(0);  //  문자를 char형 숫자로 변환하는 과정 ex)'5' -> 53
		b = Character.toString((char)a);  //  53 -> '5'
		
		System.out.println(a);
		System.out.println(b);
	}
}




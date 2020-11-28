package algorithm1;

import java.util.Arrays;

public class Find8 {

	public static void main(String[] args) {
		
		int[] arr = new int[14];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("----------------------------");
		

		String str = "";
		
		for(int i=0; i<arr.length; i++) {
			str += arr[i]+"";
		}
		
		System.out.println(str);
		
		System.out.println("----------------------------");
		
		
		int count = 0;

		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 49) {
				count++;
			}
			// 아스키코드 활용 48 = 숫자 0, 57 = 숫자 9
		}
		System.out.println(Character.toString((char)49)+"이 나온 횟수는 : "+count+"입니다.");
	}
}



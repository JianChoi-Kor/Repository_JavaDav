package package_12;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		String str = "100";
		int i = Integer.parseInt(str);
		
		String str2 = String.valueOf(i);
		
		System.out.println(i);
		System.out.println(str2);
		
//		다음
		
		Random random = new Random();
		int rand = random.nextInt(5)+4;
		
		System.out.println(rand);
		
//		다음
		
		boolean isMarried = true;
		
		String mstr;
		
		mstr = isMarried ? "결혼 안 했다" : "결혼 했다";
		
		System.out.println(mstr);
		
		

	}

}

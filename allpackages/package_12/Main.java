package package_12;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		String str = "100";
		int i = Integer.parseInt(str);
		
		String str2 = String.valueOf(i);
		
		System.out.println(i);
		System.out.println(str2);
		
//		����
		
		Random random = new Random();
		int rand = random.nextInt(5)+4;
		
		System.out.println(rand);
		
//		����
		
		boolean isMarried = true;
		
		String mstr;
		
		mstr = isMarried ? "��ȥ �� �ߴ�" : "��ȥ �ߴ�";
		
		System.out.println(mstr);
		
		

	}

}

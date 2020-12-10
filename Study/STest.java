package Study;

public class STest {

	public static void main(String[] args) {
		
		String s = "pPoooyY";
		
		boolean count = count(s);
		
		System.out.println(count);

	}
	public static boolean count(String s) {
		boolean flag = true;
		
		String[] str = new String[s.length()];
		
		str = s.split("");
		
		int pCount = 0;
		int yCount = 0;
		
		for(int i=0; i<str.length; i++) {
			
			if(str[i].equals("p") || str[i].equals("P")) {
				pCount++;
			}
			else if(str[i].equals("y") || str[i].equals("Y")) {
				yCount++;
			}
		}
		
		if(pCount != yCount) {
			flag = false;
		}
		return flag;
	}

}

package algorithm1;

public class GetMiddle {

	public static void main(String[] args) {
		
		GetMiddle gm = new GetMiddle();
		System.out.println(gm.getMiddle("ABCDEFGHIJ"));
		
		
		String str = "abcde";
		
		System.out.println(str.substring(0, 2));
	}
	
	public String getMiddle(String word) {
		
		return word.substring((word.length()-1) / 2, word.length()/2 + 1);
		
	}
}




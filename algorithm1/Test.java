package algorithm1;


public class Test {

	public static void main(String[] args) {
		
		Test gm = new Test();
		System.out.println(gm.getMiddle("ABCDEFGHIJ"));
	}
	
	public String getMiddle(String word) {
		
		return word.substring((word.length()-1) / 2, word.length()/2 + 1);
		
	}
}



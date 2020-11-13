package package_2;

public class Pibonacci2 {

	public static void main(String[] args) {
		
		//An = An-1 + An-2
		//A1 = 1, A2 = 1
		
		int prevPrevNum = 1;  // An-2
		int prevNum = 1;  // AN-1
		
		System.out.print(prevPrevNum+" ");
		System.out.print(prevNum+" ");
		
		for(int i=3; i<=10; i++) {
			
			int nNum = prevPrevNum + prevNum;
			
			System.out.print(nNum+" ");
			
			prevPrevNum = prevNum;
			prevNum = nNum;
		}
	}
}
package Study.abst;

public class AbstractTest {

	public static void main(String[] args) {
		 
		
		AbstA aa = new AbstB();
		aa.bark();
		

		AbstB ab = (AbstB)aa;
		ab.shakeTail();

		AbstA ad = new AbstD();
		ad.bark();
		
	}

}

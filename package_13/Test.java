package package_13;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		int[] numbers = {1, 3, 2, 4,};
		
		TreeSet<Integer> hs = new TreeSet<>();
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				
				int sum = numbers[i] + numbers[j];
				
				hs.add(sum);
			}
		}
		System.out.println(hs);
	}
}




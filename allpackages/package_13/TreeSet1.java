package package_13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	
	public int[] solution(int[] numbers) {
		
		TreeSet<Integer> hs = new TreeSet<>();
		
		int[] answer = new int[hs.size()];
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				
				int sum = numbers[i] + numbers[j];
				
				hs.add(sum);
			}
		}
		
		Iterator<Integer> it = hs.iterator();
	
		while(it.hasNext()) {
			

			answer[a] = it.next();
			a++;
		}
		return answer;
	}

	
	public static void main(String[] args) {

	}

}

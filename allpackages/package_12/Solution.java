package package_12;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int[] soulution(int[] numbers) {
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5};
		
		System.out.println(solution(nums));
	}
}


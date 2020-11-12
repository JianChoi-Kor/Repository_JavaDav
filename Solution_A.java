import java.util.HashSet;
import java.util.Set;

class Solution_A {
	
	public int[] solution(int[] numbers) {
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
				}
			}
		
		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
	
	
	
	public static void main(String[] args) {
		
		int[] num = {2, 3, 6, 9, 2};
		
		System.out.println(solution(num));
	}
}

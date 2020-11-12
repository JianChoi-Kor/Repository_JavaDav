import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
	
    public static int[] solution(int[] numbers) {
    	
    	Set<Integer> set = new HashSet<>();
    	
    	for(int i=0; i<numbers.length; i++) {
    		for(int j=0; j<numbers.length; j++) {
    			set.add(numbers[i] + numbers[j]);
    		}
    	}
    	ArrayList<Integer> list = new ArrayList<Integer>(set);
    	int[] answer = new int[list.size()];
    	for(int i=0; i<answer.length; i++) {
    		answer[i] = list.get(i);
    	}
    	Arrays.sort(answer);
    	return answer;
    	
    }    
}


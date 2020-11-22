package package_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Solution {

	public int[] solution(int[] numbers) {
		
	
		HashSet<Integer> hs = new HashSet<>();
		
		int[] answer = {};
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers.length; j++) {
				
				int sum;
				sum = numbers[i] + numbers[j];
				
				hs.add(sum);
			}
		}
		
		LinkedList list = new LinkedList(hs);
		Collections.sort(list);
		
		int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
		
		
		
	}
	

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

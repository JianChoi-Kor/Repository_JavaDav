package package_13;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
			
		}
		
		List list = new LinkedList(set);   //   LinkedList(Collection C)
		Collections.sort(list);   //   Collections.sort(List list)
		System.out.println(list);
	}
}


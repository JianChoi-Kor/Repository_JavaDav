package package_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest2 {

	public static void main(String[] args) {


		
		HashMap<Integer, String> map = new HashMap<Integer, String>() {{
			put(1, "����");
			put(2, "����");
			put(3, "������");
		}};
		
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<Integer,  String> entry = entries.next();
			System.out.println("[Key]:" + entry.getKey() + "[Value]:"+ entry.getValue());
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

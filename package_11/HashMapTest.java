package package_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, String> map1 = new HashMap<String, String>(); // HashMap 생성
		HashMap<String, String> map2 = new HashMap<>(); // new에서 타입 파라미터 생략가능
		HashMap<String, String> map3 = new HashMap<>(map1); // map1의 모든 값을 가진 MashMap 생성
		HashMap<String, String> map4 = new HashMap<>(10); // 초기 용량(capacity) 지정
		HashMap<String, String> map5 = new HashMap<>(10, 0.7f); // 초기 용량, load factor지정
		HashMap<String, String> map6 = new HashMap<String, String>(){{
			put("a", "b");
		}};
		
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "사과");
		map.put(2, "포도");
		map.put(3, "딸기");
		
		
		HashMap<Integer, String> map7 = new HashMap<Integer, String>() {{
			put(1, "사과");
			put(2, "딸기");
			put(3, "포도");
		}};
		
		map7.remove(1); // key값 1 제거
		map7.clear(); // 모든 값 제거
		
		
		HashMap<Integer, String> map8 = new HashMap<Integer, String>() {{
			put(1, "사과");
			put(2, "딸기");
			put(3, "포도");
		}};
		
		System.out.println(map8);
		System.out.println(map8.get(1));
		
		
		for(Entry<Integer, String> entry : map8.entrySet()) {
			System.out.println("[Key]:" + entry.getKey() + "[Value]:" + entry.getValue());
		}
		
		System.out.println();
		
		for(Integer i : map.keySet()) {
			System.out.println("[Key]:" + i + "[Value]:" + map.get(i));
		}

		
		HashMap<Integer, String> map9 = new HashMap<Integer, String>() {{
			put(1, "수박");
			put(2, "망고");
			put(3, "복숭아");
		}};
		
		
		Iterator<Entry<Integer, String>> entries = map9.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<Integer,  String> entry = entries.next();
			System.out.println("[Key]:" + entry.getKey() + "[Value]:"+ entry.getValue());
		}
		
		
		
		
		System.out.println(map6);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

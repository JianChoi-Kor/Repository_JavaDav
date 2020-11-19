package package_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, String> map1 = new HashMap<String, String>(); // HashMap ����
		HashMap<String, String> map2 = new HashMap<>(); // new���� Ÿ�� �Ķ���� ��������
		HashMap<String, String> map3 = new HashMap<>(map1); // map1�� ��� ���� ���� MashMap ����
		HashMap<String, String> map4 = new HashMap<>(10); // �ʱ� �뷮(capacity) ����
		HashMap<String, String> map5 = new HashMap<>(10, 0.7f); // �ʱ� �뷮, load factor����
		HashMap<String, String> map6 = new HashMap<String, String>(){{
			put("a", "b");
		}};
		
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "���");
		map.put(2, "����");
		map.put(3, "����");
		
		
		HashMap<Integer, String> map7 = new HashMap<Integer, String>() {{
			put(1, "���");
			put(2, "����");
			put(3, "����");
		}};
		
		map7.remove(1); // key�� 1 ����
		map7.clear(); // ��� �� ����
		
		
		HashMap<Integer, String> map8 = new HashMap<Integer, String>() {{
			put(1, "���");
			put(2, "����");
			put(3, "����");
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
			put(1, "����");
			put(2, "����");
			put(3, "������");
		}};
		
		
		Iterator<Entry<Integer, String>> entries = map9.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<Integer,  String> entry = entries.next();
			System.out.println("[Key]:" + entry.getKey() + "[Value]:"+ entry.getValue());
		}
		
		
		
		
		System.out.println(map6);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

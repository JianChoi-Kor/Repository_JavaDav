package Study.arraylistalgorithm;

import java.util.Arrays;

public class MyArrayListTest {
	public static void main(String[] args) {
		
		MyArrayList list = new MyArrayList();
		
		list.add(100);
		list.add(200);
		list.add(300);
		
		System.out.println(Arrays.toString(list.getArr()));
		
		list.add(1, 500);
		
		System.out.println(Arrays.toString(list.getArr()));
	
		System.out.println("del : "+list.remove(2));
		
		System.out.println(Arrays.toString(list.getArr()));
	}
}


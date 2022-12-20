package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] g) {
		List<Integer> li = new ArrayList<>();
		li.add(100);
		li.add(200);
		li.add(400);
		li.add(300);
		li.add(null);
		li.add(null);
		li.add(400);

		ListIterator<Integer> li1 = li.listIterator();

		while (li1.hasNext()) {
			System.out.println(li1.next());

		}
		System.out.println("================");
		while (li1.hasPrevious()) {
			System.out.println(li1.previous());
			
		}

	}

}

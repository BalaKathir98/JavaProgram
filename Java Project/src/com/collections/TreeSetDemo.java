package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> ts = new TreeSet<>();
		ts.add(100);
		ts.add(200);
		ts.add(300);
		ts.add(250);
		ts.add(350);
		ts.add(150);

		System.out.println(ts);
		
		for (Integer ts1 : ts) {
			System.out.println(ts1);}
		
			
			int size = ts.size();
			System.out.println(size);
			
		
	}
	
	
}

package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<>();
		
		m.put("Maths", 98);
		m.put("Chem", 95);
//		m.put(null, null);
		m.put("Eng", null);
		m.put("Hin", 78);
		m.put("tamil", 94);
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		
		
	
		
		

	}

}

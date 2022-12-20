package com.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
	//Insertion Order
	public static void main(String[] args) {
		Map<String, Integer> hm = new LinkedHashMap<>();
	  hm.put("Maths",90);
	  hm.put("Chemistry",95);
	  hm.put("Tamil", 80);
	  hm.put("English",92);
	  
	  System.out.println("---Prnt HashMap-----");
	  System.out.println(hm);
	  
	  System.out.println("---Prnt containsKey-----");
	  boolean containsKey = hm.containsKey("Tamil");
	  System.out.println(containsKey);
	  boolean containsValue = hm.containsValue(94);
	  System.out.println(containsValue);
	  
	  System.out.println("---Prnt keySet-----");
	  Set<String> keySet = hm.keySet();
	  System.out.println(keySet);
	  
	  System.out.println("---Prnt valueSet-----");
	  Collection<Integer> values = hm.values();
	  System.out.println(values);

	  System.out.println("---Prnt get-----");	  
	  Integer integer = hm.get("English");
	  System.out.println(integer);
	  

	}
	

}

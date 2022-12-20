package com.collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> str = new LinkedHashSet<String>();
		
		str.add("Ball");
		str.add("Bat");
		str.add("Cricket");
    	str.add("Ground");
     	str.add(null);
		str.add(null);
	    str.add("Bat");
		str.add("Match");
  System.out.println(str);
  
  str.remove("Ball");
  System.out.println(str);
   
		
//  boolean contains = str.contains("Bat");
//  System.out.println(contains );
//  
//  boolean empty = str.isEmpty();
//  System.out.println(empty);
//  
//		//hashCode for String
//        System.out.println("-----hashCode for string-----");
//        int hashCode = str.hashCode();
//		System.out.println(hashCode);
//		
//        System.out.println("-----String Size-----");
//		int size = str.size();
//		System.out.println(size);
		
}

}

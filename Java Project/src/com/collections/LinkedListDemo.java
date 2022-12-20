package com.collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		List<Integer> li = new LinkedList<>();
		li.add(100);
		li.add(200);
		li.add(400);
		li.add(300);
		li.add(null);
		li.add(null);
	
	
		System.out.println("----Prnt List -----");
		System.out.println(li);
        System.out.println("---Prnt ListSize-----");
		int size = li.size();
		System.out.println(size);
		System.out.println("------Prnt specific List-----");
		System.out.println(li.get(2));	
		System.out.println("---Prnt using For Loop and Hashcode -----");
		for (int i = 0; i < size; i++) {
			System.out.println(li.get(i));
			
			
			System.out.println();
			int hashCode = li.hashCode();
			System.out.println(hashCode);}
		
		boolean contains = li.contains(null);
		System.out.println(contains);
			
			
		
		
}
	

}

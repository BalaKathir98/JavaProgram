package StringDemo;

import java.util.Scanner;

public class StringConcept {

	public static void main(String[] args) {

		StringBuilder s = new StringBuilder("Java");
		System.out.println("Joining th StringBuffer:"+s.append("Program"));
		System.out.println("Original Name:"+s);

		Scanner sc = new Scanner(System.in);
		
		
//		StringBuilder reverse = s.reverse();
//		
//		System.out.println(reverse);

//		StringBuilder replace = s.replace(0, 4, "Python");
//		System.out.println(replace);
//		
//		StringBuilder insert = s.insert(2,"sha" );
//		System.out.println(insert);
//		
//		int capacity = s.capacity();
//		System.out.println(capacity);
		
		String s1 = "Java";
		System.out.println("Joining the String :"+s1.concat("Program"));
		System.out.println("Original Name :"+s1);

	}

}

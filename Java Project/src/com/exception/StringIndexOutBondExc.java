package com.exception;

import java.io.FileReader;

public class StringIndexOutBondExc {
     public static void main(String[] args) {
		String s = "Welcome to Java";
		
		System.out.println("Given String Length is : "+  s.length());
//		System.out.println(s.charAt(16));
//		System.exit(0);
		try {
			System.out.println(s.charAt(16));
			
		} catch (Exception e) {
          System.out.println("Exception Caught");
		} 
		System.out.println("Given String Length is : "+  s.length());
    	 

    	 
	}
	
	
}

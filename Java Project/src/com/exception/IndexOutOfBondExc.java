package com.exception;

public class IndexOutOfBondExc {
	
	public static void main(String[] args) {
		  String str = "Java";
		  System.out.println(str.charAt(8));
		  try {
			  
			  System.out.println(str.charAt(8));
			
		} catch (Exception e) {
                System.out.println("Exception Caught");
		
		
		}
		  
		  
		  
		  
		  
	}

}

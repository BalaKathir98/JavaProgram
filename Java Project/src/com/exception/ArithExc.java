package com.exception;

public class ArithExc {
        public static void main(String[] args) {
			int a = 0;
			int b = 10;
			int c = 0;
			
			try {
			System.out.println(	c = b/a);
				
			} catch (Exception e) {
                System.out.println("This is not valid Arithmetic Exception");
			}
        	
        	System.out.println("Value of c : "+c);
        	
        	
		}
}

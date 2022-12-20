package com.array;

import java.util.Iterator;

public class ArrayOneDim {
      public static void main(String[] args) {
		// int a [] = {10,20,30,40,50,60};
		 int a [] = new int [7];
		 
		 a[0]= 5;
		 a[1]= 10;
		 a[2]= 15;
	     a[3]= 20;
		 a[4]= 25;
		 a[5]= 30;
		 a[6]= 10;
		 System.out.println("Prnt specfic array: ");
		 System.out.println(a[0]);
		
		 System.out.println("Prnt array size :");
		 int arSize = a.length;
		 System.out.println(arSize);
//		 System.exit(0);
		 System.out.println("Prnt using for loop");
		 
		 for (int i = 0; i < 2; i++) {
			 System.out.println(a[i]);
			}
		 System.out.println("Prnt using dummy length using clone ");
		
		 int[] dummy = a.clone();
		 
		 dummy[2] = 2000;
		 
		 System.out.println(dummy[1]);
		 
		 for (int i : dummy) {
			System.out.println(i);
		}
	
		 
      } }
    	



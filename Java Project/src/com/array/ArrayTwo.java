package com.array;

import java.util.Scanner;

public class ArrayTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int [m][n];
		
		System.out.println("Enter the values : ");
		for (int i = 0; i <m; i++) {
			for (int j=0; j<n;j++) {
			
			a[i] [j] = sc.nextInt();
		}}

		
		System.out.println("Enter the index to be prnt :");
		int z = sc.nextInt();
	     int y = sc.nextInt();
		
    	System.out.print(a[z][y]+ " ");
		
		
		
		
		}
		
		
		
		
		
	}



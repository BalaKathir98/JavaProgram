package com.controlstatement;

import java.util.Scanner;

public class IfElse {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a != b) {
			System.out.println("a is not equal to b");
			
	} else {
		System.out.println("a is eqaul to b");
	}
}
}

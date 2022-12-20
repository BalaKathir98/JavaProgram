package com.controlstatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
      System.out.println("Calculator");
      System.out.println("Addition");
      System.out.println("Subtraction");
      System.out.println("Multiplication");
      System.out.println("Division");
      System.out.println("Enter Your Choice : 1-4 ");
      Scanner sc = new Scanner(System.in);
      int choice = sc.nextInt();
      switch (choice) {
	case 1:
		System.out.println("Enter Number 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int b = sc.nextInt();
		int addResult = a+b ;
		System.out.println("Addition of two Numbers : "+addResult);
		break;
	case 2: 
		System.out.println("Enter Number 1 : ");
		int c = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int d = sc.nextInt();
		int subResult = c-d ;
		System.out.println("Subtraction of two Numbers : "+subResult);
		
		break;
	case 3: 
		System.out.println("Enter Number 1 : ");
		int e = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int f = sc.nextInt();
		int MultResult = e*f ;
		System.out.println("Multiplication of two Numbers : "+MultResult);
		break;
	default:
		
		System.out.println("Choose above any one option");
		break;
	}
      }
	
	}

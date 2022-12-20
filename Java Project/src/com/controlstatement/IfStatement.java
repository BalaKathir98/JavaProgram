package com.controlstatement;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a>=b) {
			System.out.println("a is big");
			sc.close();
		}
		
	}

}

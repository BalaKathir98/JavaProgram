package com.controlstatement;

import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the values : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a>b) {
		if (a>c) {
			System.out.println("First Value ias Big");
			} else {
			System.out.println("Third Value is Big");
			
			}
	}		else {
		if (b>c) {
			System.out.println("Second Value is big");
			} else {
            System.out.println("3rd value is big");
            }}
	}}

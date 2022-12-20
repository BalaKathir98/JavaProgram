package com.controlstatement;

import java.util.Scanner;

public class IfElseLadder {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
 		System.out.println("Enter the Mark : ");
 		int m = sc.nextInt();
 		
 		
 		if (m>=90) {
 			System.out.println("Grade = A");
		}else if (m>=70) {
			System.out.println("Grade = B ");
			
		}else if (m>=60) {
			System.out.println("Grade = C ");
		}else {
				System.out.println("Grade = D ");
			}
			
		}
		
		
		}



   
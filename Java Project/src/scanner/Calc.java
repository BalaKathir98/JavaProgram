package scanner;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Getting input from user
		System.out.println("Enter Number 1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter Number 2 :");
		int num2 = sc.nextInt();
	int Result = num1+ num2;
	int Result1 = num1 - num2;
	int Result2 = num1 * num2;
//		float Result3 = num1 / num2;
	System.out.println("Addition of two numbers :"+Result);
    System.out.println("Sub of two numbers : "+Result1);
    System.out.println("Multipilcation of two numbers : "+Result2);
//		System.out.println("Division of two numbers : " + Result3);
		sc.close();
	}
}

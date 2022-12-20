package scanner;

import java.util.Scanner;

public class Emp {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Emp id  : ");
		int Name = sc.nextInt();
		System.out.println("Enter Your Initial : ");
		String Initial = sc.next();
		System.out.println("Employee Name is : "+Name+"."+Initial);
		System.out.println("Enter Your Salary : ");
		int salary = sc.nextInt();
		System.out.println("Your Salary is : "+salary);
		sc.close();
	}
}

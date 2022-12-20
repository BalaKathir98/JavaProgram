package com.inheritance;

public class ChildClass1 extends ChildClass2 {
	private void salary() {
   System.out.println("Monthly Salary 25k");
	}
	
	public static void main(String[] args) {
		
		ChildClass1 cc = new ChildClass1();
		cc.salary();
		cc.bankdetails();
		cc.assets();
		cc.bussiness();
	}
	
	

}

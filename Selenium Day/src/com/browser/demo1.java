package com.browser;

public class demo1 {
	void Animal(char c) {
		System.out.println("PetName:" + c);
	}
	void Animal(int n) {
		System.out.println("PetID" + n);
	}
	public static void main (String args[]) {
		demo1 a = new demo1();
		a.Animal(1);
		a.Animal('d');
	}
	
	
}

package com.keywords;

public class Demo extends Keywords {

	int a = 56;

	public void test() {
		System.out.println("current Class" + this.b);
		System.out.println("Parent class:" + super.a);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.test();
	}
}

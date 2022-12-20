package com.controlstatement;

public class ReturnType {
	public boolean add() {
		int a = 50;
		int b = 40;
		if (a > b)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		ReturnType rt = new ReturnType();
		System.out.println(rt.add());
	}
}

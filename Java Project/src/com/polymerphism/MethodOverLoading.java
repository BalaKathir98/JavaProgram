package com.polymerphism;

public class MethodOverLoading {

//	Polymerphism ---> Poly  means Many 
//	                  merphism means forms
//	                  
//	                  one task can be completed in many Ways
//	                  
//	                  * Method OverLoading -- Compile time Polymerphism -- Static binding
	// in a same Class Method name will be Same Parameter will be Different
//	                                      based on * Data Type
//	                                               * Data Count
//	                                               * Data Order
//	                  * Method OverRiding  -- Run time Polymerphism -- Dynamic Binding

	public void apple() {

		System.out.println("A fruit is Apple");
	}

	public void apple(int i,int e) {
		System.out.println("Apple price is" + i);
	}

	public void apple(String s , int e){
		System.out.println("my name is :"+s+","+e);
	}
	
	public void apple(String s , int e , String o){
		System.out.println("my name is :"+s+","+e);
	}
	
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		m.apple();
		m.apple(48,54);
		m.apple("anu", 8);
		m.apple("rajesh",2 , "Anu");

	}

}

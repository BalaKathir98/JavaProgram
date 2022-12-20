 package MethodOverloading;

public class MethodOverriding extends MethodOverloading {
	@Override
	public void student(String Name, int Idno, String Course) {
	
		super.student(Name, Idno, Course);
	}
	
	
	@Override
	public void student(int age, String Place) {
             System.out.println();
		
		super.student(age, Place);
	}
	
	


	
	public static void main(String[] args) {
		MethodOverriding mor = new MethodOverriding();
		mor.student("Jeya",24 ,"Physics");
		mor.student(22,"sdss");
		
		
	}
	

	
	
}

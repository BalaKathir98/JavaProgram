package MethodOverloading;

public class MethodOverloading {
	public  void student(String Name, int Idno, String Course ) {
		System.out.println("Std Name Is "+Name);
		System.out.println("Std ID no is "+Idno);
		System.out.println("Std Degree "+Course);
	}
public void student(int age, String Place) {
	System.out.println("Std age is "+age);
	System.out.println("Place of birth "+Place);
}
 

public static void main(String[] args) {
	MethodOverloading mo = new MethodOverloading();
	mo.student("Udhay",26,"Phy" );
	mo.student(25,"Chennai");
}


}

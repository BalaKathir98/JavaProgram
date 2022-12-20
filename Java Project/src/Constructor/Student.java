package Constructor;

public class Student {
	
	 public  Student() {
		  System.out.println("Non - Parameterised ");
	 }
	 public Student(int b) {
		 System.out.println("Parameterised Constructor "+b);
		 
	 }
	 public Student(int b, int a) {
		 System.out.println("Parameterised Constructor : "+b);
		 
	 }
	 
	public static  void name() {
		 System.out.println("hggchg");
		
	}
	   
	
    public static void main(String[] args) {
    	Student cs = new Student();
    	Student cs1 = new Student(10);
    	Student cs2 = new Student();
    	


    	
	}
}

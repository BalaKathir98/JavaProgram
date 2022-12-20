package typesovvariables;

public class LocalVariable {
	int a = 1000;
	int e;
	 static int num = 999 ;
	 
	public static void methodOne() {
      int a = 200;
      int b = 32;
      int num = 30;
     System.out.println(a);
     System.out.println(b);
    }
	public static void main(String[] args) {
		LocalVariable lv = new LocalVariable();
		lv.methodOne();
		System.out.println(lv.a);
		System.out.println(num);
	    
		
	}

}

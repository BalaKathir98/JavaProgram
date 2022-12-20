package StringDemo;

public class StringMuttableAndImmutable {
public static void main(String[] args) {
	
	String s1 = "Java";
	String s2 = "Language";
	String s3 = "Java";
	//An object is considered immutable if its state cannot change after it is constructed.
	//when we have a duplicate value it shares the memory.
	// when we concantenate it creates a new memory
	
	
	
	System.out.println(s3.hashCode()); 
	
	System.out.println("------Immutable--------");
	int s1IHC = System.identityHashCode(s1);
	int s2IHC = System.identityHashCode(s2);
	int s3IHC = System.identityHashCode(s3);

	
	System.out.println(s1IHC);
	System.out.println(s2IHC);
	System.out.println(s3IHC);

	String concat = s2.concat(s3);
	System.out.println(concat);
	System.out.println(System.identityHashCode(concat));

	System.out.println("-----Muttable (String Buffer)------");
	
	//An object is considered mutable if its state can change after it is constructed.
	//when we have  a duplicate value it creates a new memory
	// when we append it will  share the memory
	
	StringBuffer s4 = new StringBuffer ("Program");
	StringBuffer s5 = new StringBuffer ("Program");
	System.out.println(System.identityHashCode(s4));
	System.out.println(System.identityHashCode(s5));
	
	StringBuffer append = s4.append(s5);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
	
	
	System.out.println("------Muttable (String Builder----------)");
	

	StringBuilder s6 = new StringBuilder ("Java");
	StringBuilder s7 = new StringBuilder ("Java");
	System.out.println(System.identityHashCode(s6));
	System.out.println(System.identityHashCode(s7));
	
	StringBuilder append1 = s6.append(s7);
	System.out.println(append1);
	System.out.println(System.identityHashCode(append1));

	
}
	
	
}

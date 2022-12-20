package StringDemo;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "jeya";
		String str2 = "UDHAYA";
		String str3 = "This is Java application";
		String str4 = "Java ";
		String str5 = "application";
		String str6 = " ";
		String str7 = "";

		// String length
		System.out.println("-----String length-----");
		int str2length = str2.length();
		System.out.println(str2length);

		// String charAt
		System.out.println("-----String charAt-----");
		System.out.println(str1.charAt(0));
		char strcharAt = str1.charAt(3);
		System.out.println(strcharAt);

		// String indexOf
		System.out.println("-----String indexOf-----");
		int indexOfstr3 = str3.indexOf('a');
		System.out.println(indexOfstr3);

		// String lastIndexOf
		System.out.println("-----String lastIndexOf-----");
		int lastIndexOf = str3.lastIndexOf('a');
		System.out.println(lastIndexOf);

		// String upperCase and lowerCase
		System.out.println("-----String upperCase and lowerCase -----");
		String upperCase = str1.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = str2.toLowerCase();
		System.out.println(lowerCase);

		// String equals
		System.out.println("-----String equals-----");
		boolean equals = str1.equals(str2);
		System.out.println(equals);

		// String equalsIgnoreCase
		System.out.println("-----String equalsIgnoreCase -----");
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println(equalsIgnoreCase);

		// String replace
		System.out.println("-----String replace -----");
		System.out.println(str3);
		String replace = str3.replace("application", "Programming");
		System.out.println(replace);

		// String Joining
		System.out.println("-----String Joining -----");
		String joindstrng = str4.concat(str5);
		System.out.println(joindstrng);

		// String contains
		System.out.println("-----String contains------");
		boolean contains = str3.contains("Java");
		System.out.println(contains);

		// String startsWith
		System.out.println("-----String startsWith -----");
		boolean startsWith = str3.startsWith("Ja");
		System.out.println(startsWith);

		// String endsWith
		System.out.println("-----String endsWith -----");
		boolean endsWith = str3.endsWith("ion");
		System.out.println(endsWith);

		// String splitUp
		System.out.println("-----String splitUp -----");
		String[] split = str3.split(" ");
		int length = split.length;
		for (int i = 0; i < length; i++) {
			System.out.println(split[i]);
		}

		// String contains
		System.out.println("-----String contains -----");
		boolean contains2 = str3.contains("ppl");
		System.out.println(contains2);

		// String isEmpty
		System.out.println("-----String isEmpty -----");
		boolean empty = str7.isEmpty();
		System.out.println(empty);

		// String isBlank
		System.out.println("-----String isBlank -----");
		boolean blank = str6.isBlank();
		System.out.println(blank);

		// String ACSII
		System.out.println("-----String ACSII -----");
		char a = 'a';
		int x = a;
		System.out.println(x);
		int b = 65;
		char s = (char) b;
		System.out.println(s);

		// String compareTo
		System.out.println("-----String compareTo  -----");
		int compareTo = str1.compareTo(str2);
		System.out.println(compareTo);

		// String subString
		System.out.println("---- String subString-----");
		String substring = str3.substring(2, 5);
		System.out.println(substring);
		String substring2 = str3.substring(5);
		System.out.println(substring2);

	}
}

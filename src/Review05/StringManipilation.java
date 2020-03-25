package Review05;

public class StringManipilation {

	public static void main(String[] args) {
	/* str.length() ----> how many characters
	      str.toUppercase()/toLowercase------> converts to upper or lower
	        empty()--------->checks if any characters inside the String
	        trim() -----------> cuts spaces before and after string
	        str.equals()/equalsIgnoreCase --------------> compares two strings
	        contains() ------> checks if certains sequaence of character or characters present in the string
	        startwith / endWith ----->check if string starts or ends with particular seq. of characters
	        concat() ----> to attach 1 string to another */

		String str = "Hello2! ";

		System.out.println(str.length());
		System.out.println(str.toUpperCase());

		// str has not changed
		System.out.println(str);
		System.out.println(str.toLowerCase());

		System.out.println(str.equals("hello2! "));
		System.out.println(str.equalsIgnoreCase("hello2! "));

		boolean starts = str.startsWith("he");
		System.out.println("str.startsWith(he) -> " + starts);
		System.out.println(str.endsWith("2! "));

		// Method chaining
		starts = str.toLowerCase().startsWith("he");
		System.out.println(starts);

		char fifthCharacter = str.charAt(4);
		System.out.println(fifthCharacter);

		String reverse = "";
		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
//			System.out.print(charArray[i]);
			reverse += charArray[i];
		}

		System.out.println("reverse is ->" + reverse);
		
		int index = str.indexOf("llo");
		System.out.println(index);
		
		String example = "Something inside here";
		int index2 = example.indexOf("e", 19);
		System.out.println(index2);
		
		
		
		
	}

}

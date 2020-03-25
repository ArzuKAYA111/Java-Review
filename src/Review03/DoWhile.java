package Review03;

public class DoWhile {

	public static void main(String[] args) {
		int age= 0;
		while (age<11) {
			System.out.println("Happy birthday ");
		age++;	
		}
System.out.println(" Now you are grown ! You don not need a birthday celebration");
	
	System.out.println("             ");
	
int age2= 1;
	do {
		System.out.println("Happy birthday! You are "+age2 +" years old.");	
		
		age2++;
	}while(age2<11);
	
	System.out.println(" Now you are grown ! "
			+ "You don not need a birthday celebration");
	
	System.out.println("                    ");
	
	
	// Hocadan ! age ler yukari ile ayni diye yanlarina 1 yazdim.
	
	// Similarity between while && do-while
			int age1 = 0; // just born

			while (age1 < 10) {
				age1++;
				System.out.println("Happy birthday! You are " + age1 + " years old.");
			}
			System.out.println("Now you are grown! You don't need a birthday celebration.");
			
System.out.println("                   ");

			int age21 = 0; // just born my second son
			do {
				age21++;
				System.out.println("Happy birthday! You are " + age21 + " years old.");
			} while (age21 < 10);
			System.out.println("Now you are grown! You don't need a birthday celebration.");

			// Difference between while && do-while
			String greeting = "Hi";
			boolean happy = false;
			while (happy) {
				System.out.println(greeting + " inside while");
			}

			do {
				System.out.println(greeting + " inside do-while");
			} while (false);

	}

}

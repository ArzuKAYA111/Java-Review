package Review03;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// Ask the user to enter many positive number and add it to the total
		// He should enter -1 to STOP. -1 will not be added to the total	
		
	 Scanner scan;
	 scan=new Scanner(System.in);

	 int numbr=0;
	
	 int totl= 0;
	for( int i=0; i>=0; i++) {
	 System.out.println(" please enter many a positive number to stop enter -1");
		 numbr= scan.nextInt();
		 totl=totl+numbr;
		if (numbr==-1) {
			System.out.println("Stop");
			break;	
		}
	}
	System.out.println(" Total is " +totl);
	
	
//	System.out.println("                    ");
	
	 // Hocadan!
	
	Scanner input = new Scanner(System.in);
	int total = 0;
	int number = 0;

	// 1st way, using while
//	System.out.println("Enter a number. To stop enter -1");
//	number = input.nextInt();
//
//	while (number != -1) {
//		total += number;
//		
//		System.out.println("Enter a number. To stop enter -1");
//		number = input.nextInt();
//	}
//	System.out.println("The total is = " + total);

	// 2nd way, using do-while
//	do {
//		System.out.println("Enter a number. To stop enter -1");
//		number = input.nextInt();
//		// a version, to check for -1
////		if (number == -1) {
////			break;
////		} else {
////			total += number;
////		}
//
//		// b version, to check for -1
//		if (number != -1) {
//			total += number;
//		}
//	} while (number != -1);
//	System.out.println("The total is = " + total);

	// 3rd way, using for
//	for (; number != -1;) {
//		System.out.println("Enter a number. To stop enter -1");
//		number = input.nextInt();
//		if (number != -1) {
//			total += number;
//		}
//	}
//
//	System.out.println("The total is = " + total);
}
	 
	}



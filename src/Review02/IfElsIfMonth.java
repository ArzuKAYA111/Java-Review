package Review02;

import java.util.Scanner;

public class IfElsIfMonth {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter mont number");
		int month;
	String	result=null;
		month=scan.nextInt();
		
        if (month == 1) {
          result="January";
        } else if (month == 2) {
        	 result="February";
        } else if (month == 3) {
        	 result="March";
        } else if (month == 4) {
        	 result="April";
        } else if (month == 5) {
        	 result="May";
        } else if (month == 6) {
        	 result="June";
        } else if (month == 7) {
        	 result="July";
        } else if (month == 8) {
        	 result="August";
        } else if (month == 9) {
        	 result="Sep";
        } else if (month == 10) {
        	 result="Oct";
        } else if (month == 11) {
        	 result="Nov";
        } else if (month == 12) {
        	 result="Dec";
        } else {
            System.out.println("Invalid Month");
        }
        
        System.out.println("result"+ result);	
		
		
	}

}

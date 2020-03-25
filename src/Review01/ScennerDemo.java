package Review01;

import java.util.Scanner;

public class ScennerDemo {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	
	System.out.println("Please enter your age" );
	
	int age=input.nextInt();
	if (age<10)
	{
		System.out.println("you are too young");
	}
	
	
	}

}

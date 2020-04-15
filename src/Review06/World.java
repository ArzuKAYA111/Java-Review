package Review06;

public class World {// its test class World

	public static void main(String[] args) {
//		Baby baby1;  
//		                    // in two steps
//		baby1= new Baby();
		
		Baby baby1= new Baby();

baby1.firstName=" John";
baby1.lastName=" Smith";		
baby1.gender='M';
baby1.weight=7 ;
baby1.haircolor="brown";

baby1.cry();
baby1.walk();
baby1.talk(4);


// reasign value can be
baby1.weight=8 ;
 
System.out.println(" baby1 firstname is "+ baby1.firstName);

String variable=baby1.lastName;
variable="Kaya";
System.out.println(" baby1 lastname is "+ variable);

System.out.println("     ");
// second object
Baby baby2= new Baby();

baby2.firstName=" John";
baby2.lastName=" Smith";		
baby2.gender='F';
baby2.weight=9 ;
baby2.haircolor="black";

baby2.cry();
baby2.walk();
baby2.talk(5);


	} 

}

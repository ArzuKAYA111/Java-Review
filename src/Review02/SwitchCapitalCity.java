package Review02;

public class SwitchCapitalCity {

	public static void main(String[] args) {
		String capitalCity="";
        String country="Russia";
		
		switch(country) {
		case"US":
			capitalCity="washington Dc";
		break;
		case"Russia":
			capitalCity="Moscow";	
			break;
		case"Turkey":
			capitalCity="Ankara";	
			break;
		case"Albania":
			capitalCity="Tirana";	
			break;
		case"Pakistan":
			capitalCity="Islamabad";	
			break;
	default:
		capitalCity="Not in my list ";		
		}
		System.out.println("The capital city of " + country + " is " + capitalCity);
		
		System.out.println("              ");
		
		//HOCADAN
		
	String country1 = "Turkey";
		String capitalCity1 = "";

		switch (country1) {
		case "US":
			capitalCity1 = "Washington DC";
			break;
		case "Russia":
			capitalCity1 = "Moscow";
			break;
		case "China":
			capitalCity1 = "Beijing";
			break;
		case "Albania":
			capitalCity1 = "Tirana";
			break;
		case "Pakistan":
			capitalCity1 = "Islamabad";
			break;
		case "Turkey":
			capitalCity1 = "Ankara";
			break;
		default:
		capitalCity1 = "not in my list";
			break;
	}
		System.out.println("The capital city of " + country1 + " is " + capitalCity1);
		
	}

}

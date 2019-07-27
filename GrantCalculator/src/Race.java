
public class Race {
	private static String race;
	private static double raceMoney = 10;
	
	public static double checkRace(String r) {
		 race = r;
		 
		switch(race) {
		case "White":
			raceMoney += 50;
			break;
		case "Black or African American":
			raceMoney += 300;
			break;
		case "American Indian or Alaska Native":
			raceMoney += 500;
			break;
		case "Asian":
			raceMoney += 200;
			break;
		case "Native Hawaiian or Other Pacific Islander":
			raceMoney += 400;
			break;
		default:
			break;
		}
		
		return raceMoney;
	}
	
}

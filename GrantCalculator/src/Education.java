
public class Education {
	private static String education;
	private static double eduMoney = 100;
	
	public static double checkEducation(String edu) {
		education = edu;
		
		switch(education){
		case "Associate Degree":
			eduMoney += 1500;
			break;
		case "Basic High School Diploma":
			eduMoney += 500;
			break;
		case "Honors High School Diploma":
			eduMoney += 1000;
			break;
		case "Undergraduate":
			eduMoney += 2000;
			break;
		case "Graduate":
			eduMoney += 3000;
			break;
		default:
			break;
		}
		
		return eduMoney;
	}
}


public class FamilyIncome {
	private static double fIncome;
	private static double incomeMoney = 100;
	
	public static double checkIncome(double in) {
		fIncome = in;
		if(fIncome > 200000) {
			incomeMoney += 200;
		}
		else if(fIncome > 150000 && fIncome < 200000) {
			incomeMoney += 400;
		}
		else if(fIncome > 100000 && fIncome < 150000) {
			incomeMoney += 1000;
		}
		else if(fIncome > 800000&& fIncome < 100000) {
			incomeMoney += 2000;
		}
		else {
			incomeMoney += 5000;
		}
		return incomeMoney;
	}
}

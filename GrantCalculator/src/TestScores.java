//make sure to only return the score from the checkACT method, because it takes the grant from the SAT calculations as well. 
public class TestScores {
	private static int SAT;
	private static int ACT;
	private static double testMoney = 100;
	
	public static double checkSAT(int a) {
		SAT = a;
		if(SAT > 1500) {
			testMoney += 5000;
		}
		else if(SAT > 1300) {
			testMoney += 3000;
		}
		else if(SAT > 1000) {
			testMoney += 1500;
		}
		else {
			testMoney += 1000;
		}
		return testMoney;
	}
	
	public static double checkACT(int b) {
		ACT = b;
		if(ACT > 34) {
			testMoney += 5000;
		}
		else if(ACT > 30) {
			testMoney += 3000;
		}
		else if(ACT > 23) {
			testMoney += 1500;
		}
		else {
			testMoney += 1000;
		}
		return testMoney;
	}
}

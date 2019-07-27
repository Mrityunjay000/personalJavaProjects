import java.util.Scanner;

public class GCalcRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your family's income?");
		System.out.println(FamilyIncome.checkIncome(kb.nextDouble()));
	}

}

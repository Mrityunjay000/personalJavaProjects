import java.util.Scanner;

public class Job {
	private static String job;
	private static double jobMoney = 50;
	private static Scanner kb = new Scanner (System.in);
	
	public static double checkJob(String job) {
		job = job;
		
		if(job.equals("yes")) {
			System.out.println("How many hours do you work per week?");
			int response = kb.nextInt();
			if(response > 20) {
				jobMoney += 1000;
			}
			else if(response > 10 && response <= 20) {
				jobMoney += 500;
			}
			else {
				jobMoney += 100;
			}
		}
		else if(job.equals("no")) {
			jobMoney += 50;
		}
		else {
			;
		}
		
		return jobMoney;
	}
}

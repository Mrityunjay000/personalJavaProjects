import java.util.ArrayList;

public class NumComputer {
	
	//provides the facotrial number
	public static int factorial(int a) {
		if(a == 0) {
			return 1;
		}
		if(a == 1) {
			return 1;
		}
		else {
			return a * factorial(a-1);
		}
	}
	
	//computes equation around c
	public static double compute(ArrayList<String> list, double c) {
		//"+5657Y^4+y^3+Y^2+2789"
		double ans = 0.0;
		
		loop:
		for(int i = 0; i < list.size(); i++) {
			String temp = list.get(i);
			if(!temp.contains("x")) {
				ans = ans + Double.parseDouble(temp);
				continue loop;
			}
			int idx1 = temp.indexOf("x");
			int idx2 = temp.indexOf("^");
			double cof = 1;
			double deg = 1;
			if(idx1 != 0) {
				if(temp.contains("-x")) {
					cof = -1;
				}
				else if(temp.contains("+x")) {
					cof = 1;
				}
				else {
					cof = Double.parseDouble((temp.substring(0,idx1)));
				}
			}
			if(idx2 != -1) {
				deg = Double.parseDouble((temp.substring(idx2+1)));

			}
			ans = ans + (cof * (Math.pow(c, deg)));
		}
		return ans;

	}

}

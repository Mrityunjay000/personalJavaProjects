import java.util.ArrayList;
import java.util.Arrays;

public class TaylorConverter {
	
	private String equation = ""; // the original function given in for conversion
	private ArrayList<String> list = new ArrayList<>(); //the original string split into separate terms along with their signs.
	//private ArrayList<String> newList = new ArrayList<>(); //the original string split into separate terms along with their signs.
	private String[] ray;;
	
	public TaylorConverter (String string) {
		string = string.toLowerCase();
		if(string.contains("x")) {
			equation = string;
		}
		else { //this block changes everything to a lowercase "x" for the variable. assuming that the function is univariate.
			char c;
			loop:
			for(int i = 97; i <= 122; i++) {
				c = (char)i; 
				if(string.contains(Character.toString(c))) {
					string = string.replaceAll(Character.toString(c), "x");
					break loop;
				}
			}
		}
		equation = string;
		
		while(equation.contains("x^0")) {
			//System.out.println("im here");
			equation = equation.replace("x^0", "");
		}
		while(equation.contains("+x")) {
			//System.out.println("im here");
			equation = equation.replace("+x", "+1x");
		}
		while(equation.contains("-x")) {
			//System.out.println("im here");
			equation = equation.replace("-x", "-1x");
		}
		//----------------------------------------------------------
		//converting original equation into an arrayList
		String temp = Character.toString(string.charAt(0));
		for(int i = 1; i < string.length(); i++) {
			if(Character.toString(string.charAt(i)).equals("+") 
					|| Character.toString(string.charAt(i)).equals("-")) {
				list.add(temp);
				temp = Character.toString(string.charAt(i));
			}
			else {
				temp += Character.toString(string.charAt(i));
			}
			
		}
		list.add(temp);
		ray = new String[list.size()];
		//System.out.println(list.size());
		//System.out.println(list);
		//System.out.println(Arrays.toString(ray));
	}
	
	public String toString(double c) {
		String response = "";
		PolynomialDerivative d = new PolynomialDerivative();
		for(int i = 0; i < 5; i++) {
			//System.out.println("i = " + i);
			//System.out.println("list = " + list);
			//System.out.println("response = " + response);
			//System.out.println("NumComputer.compute(list, c) = " + NumComputer.compute(list, c));
			//System.out.println("NumComputer.factorial(i) = " + NumComputer.factorial(i));
			if((NumComputer.compute(list, c)/NumComputer.factorial(i) >= 0) &&
					(NumComputer.compute(list, c)/NumComputer.factorial(i) != 0)) {
				if(i==0) {
					response += "+" + (NumComputer.compute(list, c)/NumComputer.factorial(i)) + " ";	
				}
				else {
					response += "+" + (NumComputer.compute(list, c)/NumComputer.factorial(i)) + "x^" + i + " ";
				}
			}
			else {
				if(NumComputer.compute(list, c)/NumComputer.factorial(i) != 0) {
					if(i==0) {
						response += "-" + (NumComputer.compute(list, c)/NumComputer.factorial(i)) + " ";
					}
					else {
						response += "-" + (NumComputer.compute(list, c)/NumComputer.factorial(i)) + "x^" + i + " ";						
					}
				}
			}
			//this for loop is simply getting the derivation. 
			for(int a = 0; a < list.size(); a++) {
				//System.out.println("a = " + a);
				ray[a] = d.derive(list.get(a));
				list.set(a, ray[a]);
				//ray.add(a);
			}
			//System.out.println("this is list in TaylorPolynomial after derivation = " + list);
			//System.out.println();
		}
		return response;
	}
}

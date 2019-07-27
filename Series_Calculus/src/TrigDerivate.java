import java.util.Hashtable;

public class TrigDerivate extends Derivative {
	private Hashtable <String, String> basicDerivatives = new Hashtable<>();
	/*
	 * sin - cos
	 * cos - -sin
	 * tan - sec^2
	 * csc - -csccot
	 * sec - sectan
	 * cot - -csc^2
	 */
	
	public TrigDerivate () {
		basicDerivatives.put("sin(x)", "cos(x)");
		basicDerivatives.put("cos(x)", "-sin(x)");
		basicDerivatives.put("tan(x)", "(sec(x))^2");
		basicDerivatives.put("csc(x)", "-csc(x)cot(x)");
		basicDerivatives.put("sec(x)", "sec(x)tan(x)");
		basicDerivatives.put("cot(x)", "-(csc(x))^2");
	}
	
	public String derive(String string) {
		return basicDerivatives.get(string);
	}

}

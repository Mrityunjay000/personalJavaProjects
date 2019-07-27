import java.util.ArrayList;

public class PolynomialDerivative extends Derivative {
	
	private ArrayList<String> list = new ArrayList<>(); //the original string split into separate terms along with their signs.
	private ArrayList<String> derivedList = new ArrayList<>();
	
	
	public String derive(String str) {
		
		//System.out.println("this is the list input for derivation before = " + list);
		//derivedList.clear();
		/*for(int i = 0; i < l.size(); i++) {
			list.add(l.get(i));
		}*/
		//list = l;
		//System.out.println("this is the list input for derivation after = " + list);
		//System.out.println("this is derivedList = " + derivedList);
		//for(int i = 0; i < l.size(); i++) {
			//String str = l.get(i);
			if(str.contains("x")) {
				//derivedList.add("0");
				int idx1 = str.indexOf("x");
				int idx2 = str.indexOf("^");
				double cof = 1;
				double deg = 1;
				if(idx1 != 0) {
					//cof = Double.parseDouble((str.substring(0,idx1)));
					if(str.contains("-x")) {
						cof = -1;
					}
					else if(str.contains("+x")) {
						cof = 1;
					}
					else {
						cof = Double.parseDouble((str.substring(0,idx1)));
					}
				}
				if(idx2 != -1) {
					deg = Double.parseDouble((str.substring(idx2+1)));

				}
				//derivedList.add((cof*deg)+"x^"+(deg-1));
				return (cof*deg)+"x^"+(deg-1);
			}
			else {
				return "0";
			
		}
						
		//return derivedList;
	}
	
	
	/*public ArrayList<String> print() {
		return list;
	}
	public ArrayList<String> printDeriv() {
		return derivedList;
	}*/
}


public class Runner {
	public static void main(String args[]) {
		//"x^4+x^3-x^2+2789"
		TaylorConverter conv = new TaylorConverter("x^2+x+1");
		System.out.println(conv.toString(5));
		//Y^4+y^3-Y^2+2789
	}
}

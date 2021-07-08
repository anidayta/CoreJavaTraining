package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String x ="100";
		System.out.println(x+200);
		
		//data conversion from string to int
		
		int i = Integer.parseInt(x);
		System.out.println(i+200);
		
		//string to double
		
		String y = "10.25";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//Note: String to Char cannot be converted
		//String to Boolean
		
		String a= "True";
		boolean b = Boolean.parseBoolean(a);
		System.out.println(b);
		
		
		//int to String conversion
		int k= 100;
		System.out.println(k+20);
		
		String s = String.valueOf(k);
		System.out.println(s+20);
		
		String u = "100A";
		int m = Integer.parseInt(u);
		System.out.println(m); //Exception in thread "main" java.lang.NumberFormatException: For input string: "100A"

		
	}

}

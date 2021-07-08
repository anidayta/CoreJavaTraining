package JavaBasics;
public class StringConcatination {

	public static void main(String[] args) {
 
		// (+) sign is concatenation operator 
		
		int  a = 100;
		int  b = 200;
		 
		String x = "Hello";
		String y = "world";
		
		double c= 12.1;
		double d= 15.55;
		
		// execution always starts from left to right
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(c+d);
		System.out.println(a+b+c+d);
		System.out.println(a+x+y+b);
		System.out.println(a+b+c+d+y);
		System.out.println(a+b+ (x+y));
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		
		System.out.println("Test"); 
		System.out.println("Selenium");
		
		//with println is used to print on the console on the new line
		    //Output Test
			//Output Selenium
		
		System.out.print("Test"); //
		System.out.println("Selenium");
		
		//without ln (line space)-just used to print on the console 
		//output: TestSelenium
		
	}
	
	

}

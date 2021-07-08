package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		
		if(a<b){
			System.out.println("a is greater then b");
		}
		else {
			System.out.println("b is greater then a");
		}
		
		if(a>b){
			System.out.println("a is greater then b");
		}
		else {
			System.out.println("b is greater then a");
		}
		
		

		//comparision operatorsl
		//<> <= >= == !=
		//= is sign operation whereas, == comparsion operator
		
		int c = 40;
		int d = 50;
		
		if(c==d) {
			System.out.println("c is equal to d");
		}else {
			System.out.println("d is not equal to c");
		}
		
		//Write a logic to find the greater number
		
		int a1 = 400;
		int b1 = 600;
		int c1 = 500;
		
		//nested if-else
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is greatest ");
		}
		else if(b1>c1) {
			System.out.println("b1 is greatest");
		}
		
		else {
			System.out.println("c1 is greatest");
			
		}
		
		
	}

}

package OOPSConceptPart1;

public class StaticAndNonStaticConcept {
	
	//global vars: the scope fo global variable will be available acorss all the functions with some conditions
	String name = "Tom "; //non static global variable
	static int age = 10; //static global variabl 	
	
			
	

	public static void main(String[] args) {
		//how to call static method and varaible
		//1. direct calling
		
		sum();
		
		//calling by classname
		StaticAndNonStaticConcept.sum();
		
		System.out.println("age");
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods and variable;
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can I access the  static method by object reference ? "YES" but not good practice
		obj.sum();
		
	}

	public void sendMail() { //non static method
		System.out.println("send mail method");
	}
	
	public static void sum() { //static method
		System.out.println("sum method");
	}
	
}

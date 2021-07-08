package OOPSConceptPart1;

public class Car {

	int model;
	int wheel;
	
	public static void main(String[] args) {
		//new Car() -- this is the object of the Car class
		//new keyword is used to create the Object
		//a, b, c are the Reference variable and this cannot be duplicated
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2014;
		a.wheel = 4;
		
		b.model = 2016;
		b.wheel = 5;
		
		c.model = 2018;
		c.wheel = 6;
		
		System.out.println("Before assigning the references");
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		System.out.println("-------------------");
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println("-------------------");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println("-------------------");
		
		System.out.println("After assigning the references");
		
		a=b;
		b=c;
		c=a;
		
		a.model=10;
				System.out.println(a.model);
		c.model=20;
				System.out.println(a.model);
				System.out.println(c.model);
				
				
		
	}

}

                                                      

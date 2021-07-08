package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {

	//static polymophism-- compile time polymorphism (Intevriew)
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.remoteSensor();
		b.engine();
		
		
		
		System.out.println("--------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
//you cannot access, inherit to parent (Car) from child( BMW)
		
		System.out.println("--------------");
		
		
//Top Casting
		Car c1 = new BMW(); //child class object can be referred by parent class referrnce variable, this is called dynamic polymorphism or runtime polymorphism
		c1.start();
		c1.stop();
		c1.refuel(); //you cannot access theft safety method

//Down casting (BMW)
		
  BMW b1 = (BMW) new Car(); // java.lang.ClassCastException:
  
		
		}
		
	
	}


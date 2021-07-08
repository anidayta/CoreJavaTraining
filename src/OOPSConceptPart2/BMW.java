package OOPSConceptPart2;

public class BMW extends Car{
//Any relation between two classes can be called using "extends"
	
//when same methods is present in parent class as well as in child with same same and same number of 
	//arguments is called method overloading"
	
	
	
	public void start(){//overridden method
		System.out.println("BMW--start");
			
		}
	public void theftSafety() {
		System.out.println("BMW theft Safety");
	}
	
	public void remoteSensor(){
		System.out.println("BMW remote sensor");
	}
}

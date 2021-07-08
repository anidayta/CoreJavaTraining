package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
	
		//Step 2	
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(20,30);
	
	}
	
	//Step 3
	//to overload main method
	
	public static void main(int p) {
		
	}
	
	public static void maun (int q, int h) {
		
	}
	
	//Step 1
	public void sum() {
		System.out.println("Sum method--zero parameter");
	}
	
	
	//Step (3a) to overload
	public void sum(double d) {
		System.out.println("Sum method--zero parameter");
		
	}
	public void sum(int i) {
		System.out.println("Sum method--1 input parameter");
		System.out.println(10);
		
	}
	
	public void sum(int m, int n) {
		System.out.println("Sum method--2 input parameter");
		System.out.println(20+10);
		
	}
}


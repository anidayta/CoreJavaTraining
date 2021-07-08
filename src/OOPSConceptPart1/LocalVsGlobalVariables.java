package OOPSConceptPart1;

public class LocalVsGlobalVariables {

	//Step 1
	
	//Global Variable - which defined within the class variable 
	String name = "tom";
	int age = 10;

	//Step 2
	public static void main(String[] args) {
		
		//local Variable - define after the main method.
		
		int i = 10;
		System.out.println(i);
		
		//Step 4
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	//Step 3 
	
	public void sum () {
		int i = 10;   //local variable for the sum method. 
		int j = 20;
	}
}

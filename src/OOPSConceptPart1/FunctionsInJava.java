package OOPSConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		//Step 2//
		
		FunctionsInJava obj = new FunctionsInJava();
		//one object wil be created, obj is the refernce variable referrign to this object
		//adter creating the object, the copy of all non static mthods will be given to this object
		
		
		//Step 3//
		
		obj.test();

		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30, 10);  //x= 30, y=10
		System.out.println(div);
		
		
		
		
			
	}

	//Step 1//
	
		public void test(){
			System.out.println("test method");
		
	}	
		
		//public void pqr(){ // to return value,; Void should not use
		public int pqr(){
			System.out.println("pqr method");
			int a = 10;
			int b = 20;
			int c = 30;
			int d = a+c+b;
			
			return d; 
		}
//Void method cannot return a Value, hence remove void after public, and enter the value which you wanted to return. In this case you want to return C
//public int pqr (){ is correct method to return d in above code. 
			
		
		public String qa() {
			System.out.println("QA method");
			String s ="selenium";
			
					return s;
		}
					
		public int division(int x, int y) {
		System.out.println("Division Method");
		int d = x/y;
		
		return d;
	
		}
		
}


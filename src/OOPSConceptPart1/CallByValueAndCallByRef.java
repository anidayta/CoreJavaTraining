package OOPSConceptPart1;

public class CallByValueAndCallByRef {

	//global Variable
	
	int p;
	int q;
	
	
	public static void main(String[] args) {

		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		int x= 10;
		int y= 20;
		obj.testSum(x, y); //call by Value or pass by Value 
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		
		//After Swap
		System.out.println(obj.p); //output = p= 60
		System.out.println(obj.q); //output = q= 50
	}

	public int testSum(int a, int b){ //ensure to open flower bracket
	a= 30;
	b = 20;
	int c = a+b;
	return c;
	

}
	
	//call by Reference and this is possible in JAVA
	
	public void swap(CallByValueAndCallByRef t) { //where t is the reference variable
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q; //temp = 60
		t.q = temp; //t.q= 50  - Swaped. Now the value of P is 60 , Q is 50
		
	}
		
	}
	
	

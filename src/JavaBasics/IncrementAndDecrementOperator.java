package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		//++ increment
		//-decrement
		
		int i = 1;
		int j = i++; //Post Increment
		System.out.println(i);
		System.out.println(j);
System.out.println("-------------------------");
		
		int m = 1;
		int n = ++m; //Pre increment
		System.out.println(m);
		System.out.println(n);
System.out.println("-------------------------");
		
		
		int a = 2;
		int b = a--; //post decrement
		System.out.println(a); //output1
		System.out.println(b); //output2
System.out.println("-------------------------");

		int p = 2;
		int q = --p;//(decrease the value of p by 1 and give to q, then q=1 and p=1)pre decrement
		System.out.println(p); //output1
		System.out.println(q); //output1
		
 
	}

}

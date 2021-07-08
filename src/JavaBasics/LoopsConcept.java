package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
		//1. While loop
		 
		int i=1; //initalization
		while(i<=10){  //conditional statement //while open bracket
		System.out.println(i);
		i=i+1; // /it will generate infinite loop, If you don't give incremental/decremental part, (disadvantange)-Line18
	
		}
		
System.out.println("_____________________");	
		
		
		int m=1;
		while(m<10){ //while open bracket
		System.out.println(m);
		m=m+1;
		}
		
System.out.println("_____________________");
		


					//2. for loop
	  
//print 10 to 1
//k-- means k= k-1
//10 9 8 7 6 5 4 3 2  1

		for(int k=10;k<=10;k++){  //initialization ; conditional ;incremental
		System.out.println(k);
		}
		
System.out.println("_____________________");
		
//-1>-10 true
//1>10 false

		for(int j=10;j>=-10;j--){ //initialization ; conditional ;decremental
			System.out.println(j);
			}
	}



}

package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryList {
	public static void main(String[] args) {

		int a[] = new int [3]; //static array - size is fixed
		
//dynamic array-- Array List
//1. can contain dublicate values
//2. maintains insertion order (0,1,2,3,4)
//3. it is not synchronized , and hence array list is slow
//4. Allow random access to fetch the element because it stores the value on the basis of index

		ArrayList ar = new ArrayList();
		
		ar.add(10); //0
		ar.add(20); //1
		ar.add(30); //2
		
		System.out.println(ar.size());
		
		ar.add(40); //3
		ar.add(50); //4
		ar.add(50); //5
		ar.add(12.56); //6
		ar.add("Test");
		ar.add(true);
		
		System.out.println(ar.size()); //to fetch the value for size of array
		System.out.println(ar.get(4)); //to get the value from an index
		
//Now to print all the values of array use "For loop"
//1. for loop 
//2. using iterator
		
		for(int i=0; i<ar.size(); i++){
		System.out.println(ar.get(i));
		
		//Now To Create Generic in Java
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);

//ar1.add("selenium"); //The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
	
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Test Selenium");
		
//Employee class  objects
		
		Employee e1 = new Employee ("Daya", 28, "QA");
		Employee e2 = new Employee ("Dhanu", 29, "Dev");

		
//create ArrayList
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		
//iterator to traverse the value- using while loop
		
		Iterator<Employee> it = ar4.iterator(); 
		while(it.hasNext()){
		Employee emp = it.next();
		System.out.println(emp. name);
		System.out.println(emp. age);
		System.out.println(emp. dept);
		
			}	
		System.out.println("*********");

//addall
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("java");
		ar5.add("melody");
		ar5.add("tester");
		
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("dev");
		ar6.add("test");
		ar6.add("admin");
		
		ar5.addAll(ar6);
		
		for(int j=0; j<ar5.size();j++){
			System.out.println(ar5.get(j));
		  
		}
		
			System.out.println("*********");
			
			
			
//removeAll;
			ar5.removeAll(ar6);
			for(int k=0; k<ar5.size();k++) {
				System.out.println(ar5.get(k));
				
			}

	
//retainall()
		
			ArrayList<String> ar7 = new ArrayList<String>();
			ar7.add("SUNDAY");
			ar7.add("test");
			ar7.add("admin");
			
			ArrayList<String> ar8 = new ArrayList<String>();
			ar8.add("SUNDAY");
			ar8.add("test");
			ar8.add("admin");
			
			ar7.retainAll(ar8);
			for(int m=0; m<ar7.size(); m++){
				System.out.println(ar7.get(m));
			}
			
		}
		
		
		}
	}

		

	




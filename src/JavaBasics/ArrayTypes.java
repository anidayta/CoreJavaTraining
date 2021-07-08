package JavaBasics;

public class ArrayTypes {

	public static void main(String[] args) {
		
	//One Dimensional Array//
		//Disadavntage of array
		//1. size is fixed --> static array [3]cannnot add more than 3 values ;To overcome this problem we use collections- dynamic array-Arraylist, hashtable
		//2. Sores only similar data types;  To overcome this problem we use Object array
		
		//2. Double array
		double d[] = new double [3];
		d[0] = 12.33;
		d[1] = 13.45;
		d[2] = 14.45;
		System.out.println(d[2]);
	
// char Array;
		char c[] = new char[3];
		c[0] = 'a';
		c[1]= '$';
		c[2]= '2';
		

//boolean array
		
		boolean b[] = new boolean[2];
		b[0] =true;
		b[1]= false;
		
//string Array
		
		String s[] = new String[3];
		s[0]= "Hello";
		s[1]= "good";
		s[2]= "morning";
		
		System.out.println(s.length);
		System.out.println(s[1]);
		
		
		//'O'-->Object array: super class of all the classes- is used to store different data typs
		//single dimentional array using Object
		
		
		Object ob[] = new Object[5];
		ob [0] = "Tom";
		ob [1] = 25;
		ob [2] = 22.33;
		ob [3] = "M";
		ob [4] = "london";
		
		System.out.println(ob[4]);
		System.out.println(ob.length);
	
		//for (int j=0;j < ob.length;j++){
		//System.out.println(ob[4]);
	
	}
	 
}

package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
	
	//One Dimensional Array//
		
		
		//1. Int array;
		
		// i = 10; Normal Variable
		// int i[]= new int [4]; Integer Array Variable. in this condition maximum 4 value will be stored
		// lowest bound/index is = 0
		// upper bound/index is = n-1, where n is the size of array, hence in below example: 4-1 =3 [0,1,2,3]		
		 int i [] = new int [4];
		 i[0] = 10;
		 i[1] = 20;
		 i[2] = 30;
		 i[3] = 40;


System.out.println(i[1]); //print in big bracket for arrays
System.out.println(i[2]);
System.out.println(i[3]);
//System.out.println(i[4]); //ArrayIndexOutOfBoundsException (Interview) if the print output is more than the array size (n-1 rule)- This exception occurs
	
System.out.println(i.length); //size/length of array
	
//print all the values of array of array: 


	}
}



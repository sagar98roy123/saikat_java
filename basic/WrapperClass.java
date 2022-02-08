package saikat.java.basic;

public class WrapperClass {

	public static void main(String[] args) {
		
		int i=0; // not an object , it is a variable
		
		Integer i1= new Integer(10); // object
		System.out.println(i+","+i1);
		
		char ch ='a';
		
		Character p=ch; // autoboxing
		
		Integer a= new Integer(23);
		
		int q=a; // unboxing 

	}

}

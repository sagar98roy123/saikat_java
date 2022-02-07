package saikat.java.basic;

class Student{
	String name;
}

public class DataTypes {

	public static void main(String[] args) {
		
		boolean isGear = false;
		System.out.println(isGear);
		
		byte byte1=1;
		System.out.println(byte1);
		
		short s1=512;
		System.out.println(s1);
		
		int num = 1234;
		System.out.println(num); //0 - (2^32-1)
		
		Integer num2= new Integer(num);
		
		long l1= 8917696;
		System.out.println(l1); // 0- (2^64-1)
		
		float f2=3.45f;
		System.out.println(f2);
		
		double d1= 8917696273d;
		System.out.println(d1);
		
		char c1='9';
		System.out.println(c1); // \u0000
		
		String name= "Sai**kat";
		System.out.println(name);
		
		Student s12=new Student();
	}

}

package saikat.java.basic;


class Student1{
	int roll_no=1;
	static String name="Saikat";
}

public class Variable {
	
	int saikat=0;// instance variable
	
	static int sagar=0; // static variable
	
	void add() {
		int a=0; // local variable
		System.out.println("..."+a);
	}

	public static void main(String[] args) {
		
		int saikat=20; //local variable
		System.out.println(Variable.sagar);// one way of accessing static variable
		
		int a=20;

		Student1 s1= new Student1();
		
		System.out.println(s1.roll_no+","+Student1.name);
	}

}

// 1.Local variable
// 2 . Instance variable
// 3. Static method

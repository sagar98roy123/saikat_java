package saikat.java.basic;


class Vehical{
	String color;
	int no_of_wheels;
	
	int getHeight() { // method
		return 2+2;
		
	}
	int getWeight() {
		return 167;
	}
}

public class Saikat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am Saikat Deb.");
		
		Vehical bike = new Vehical();
		bike.color="Black";
		bike.no_of_wheels=2;
		
		System.out.println("Name of the vehical is "+bike.color+
				" which is having " + bike.no_of_wheels + " wheels");
		System.out.println("Bike's height is "+bike.getHeight());
		System.out.println("Bike's weight is "+bike.getWeight());

	}

}

// HelloWorld.java 
// helloWorld.java wrong
// Helloworld.java right
// Hello World.java wrong




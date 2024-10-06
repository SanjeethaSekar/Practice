package OOPSConcept;

public class Car {

	// Class - Class is an entity where we have to define the properties in the form of methods,variables.
	//Methods & Variables - are characteristics of any particular class
	
	
	// Class variables
	
	String carmodel;
	int year;
	String carname;
	
	public static void main(String[] args) {
		
		// new Car() -- this is object of car class
		// new keyword is used to create object
		// one,two,three - object reference variables
	
		Car one = new Car(); 
		Car two = new Car();  
		Car three = new Car();
		
		one.carmodel = "Hyundai";
		one.year = 2021;
		one.carname = "Xcent";
		
		two.carmodel = "Tata";
		two.year = 2022;
		two.carname = "Punch";
		
		three.carmodel = "Maruthi";
		three.year = 2023;
		three.carname = "Brezza";
		
		System.out.println("Before assigning the reference");
		
		System.out.println(one.carmodel);
		System.out.println(one.year);
		System.out.println(one.carname);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(two.carmodel);
		System.out.println(two.year);
		System.out.println(two.carname);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(three.carmodel);
		System.out.println(three.year);
		System.out.println(three.carname);
		
		System.out.println("After shifting the reference");
		
		one = two;
		two = three;
		three = one;
		
		one.carmodel = "Renault";
		two.carmodel = "Nissan";
		
		System.out.println(three.carmodel);
		System.out.println(one.carmodel);
		System.out.println(two.carmodel);
		
		



	}

}

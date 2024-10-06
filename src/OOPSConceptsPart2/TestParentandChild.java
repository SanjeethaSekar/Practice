package OOPSConceptsPart2;

public class TestParentandChild {

	public static void main(String[] args) {
	
		CarChildTata obj = new CarChildTata(); //static polymorphism or compile time polimorphism
		obj.colour();
		obj.start();
		obj.model();
		obj.engine();
		
		System.out.println("****************************");
		
		
		CarParentClass obj1 = new CarParentClass(); // accessing Parent methods by creating obj ref for parent
		obj1.start();
		obj1.colour();
		obj1.model();
		
		
		System.out.println("****************************");
		// child class obj can be referred by parent class ref variable -- called as dynamic polymorphism or run time polymorphism
		CarParentClass obj2 = new CarChildTata();
		obj2.colour();
		obj2.model();
		obj2.start();
	
		
		
		
	}
	

	
	

}

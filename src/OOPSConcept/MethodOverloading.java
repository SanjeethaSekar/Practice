package OOPSConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		
		// Main method can also be overloaded ,with same method name but with different input parameters
	
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(15,20);

	}
	
		// Method overloading -- when the method name(here sum is method name) is same with with different input parameters or arguments within same class
	    /* When method name is same and input param also same, make sure we have different data type. 
		  Ex : Method name sum(int i) and sum(double j) */
	// duplicate methods - i.e two methods with same name and without parameter or with same parameters are not allowed
	
	public void sum() {		
	System.out.println("Without parameters");
	
	/*public void sum() {
		System.out.println("1Without parameters"); Method inside a method is not allowed*/
	
	}
	
	public void sum(int i) {
		System.out.println("With ont input parameter");
		System.out.println(i);
	}
	
	public void sum(int j, int k) {
	System.out.println("With two input parameters");
	System.out.println(j+k); 	 
	
		
	}
}

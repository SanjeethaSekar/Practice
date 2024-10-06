package OOPSConcept;

public class StaticAndNonStaticConcept {

	// Global variables: scope of global variables will be available across all functions with some conditions //
	String name = "Tom";
	static int age = 35;

	public static void main(String[] args) {
		/* how to call static methods  and variables
		 1. Direct calling */
		sum();
		
		/* 2. Calling by class name */
		
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		/* Calling static and non static methods and variables */
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		/* Can I access static methods by using object  ref? Yes, but it throws warning saying shd be cald directly or by class name*/
	
	}

	public void sendMail() {
		
		System.out.println("Send mail method");
		
	}
	
	public static void sum() {
		
		System.out.println("Sum method");
	}
}

package OOPSConcept;

public class FunctionsInJAVA {

	public static void main(String[] args) {
		
		// main method is void - never returns a value 
		
		FunctionsInJAVA obj = new FunctionsInJAVA();
		
		obj.test();
		
		int i = obj.addition();
		System.out.println(i);
		
		String n = obj.Name();
		System.out.println(n);
		
		double div = obj.division(100, 9);
		System.out.println(div);
		

	}
	//void - will not return any value
	public void test() {
		System.out.println("Test Method");
	}
	
	//return type defined as int, will return value
	public int addition() {
		int a = 10;
		int b= 15;
		int c = a+b;		
		return c;
		
	}
	
	public String Name() {
		System.out.println("The name is given below");
		String s = "Vignesh";
		return s;
	}
	
	public double division(int num1, int num2) {
		int num3 = num1/num2; 
		return num3;
	}

}

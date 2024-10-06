package HelloWorld;

import org.testng.annotations.Test;


public class PrintHello {
	
	public static void main(String[]args)
	{
		
 System.out.println("Hello Vignesh");
	
 int a = 10;
 int b = 15;
 int d = 25;
 int c = a+b;
 String s = "This is Vignesh";
 
 System.out.println(c);
System.out.println(s + c);
 System.out.println(s + c + a);
 
 if(a>b & a>d)
 {
	 System.out.println("a is greater");
 } 
	 else if(b>d){
	 
	 System.out.println("b is greater");
	 }
	 else{
	 
		 System.out.println("d is greater");
	 }
 
	}
}

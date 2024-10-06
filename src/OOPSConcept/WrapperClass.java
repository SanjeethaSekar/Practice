package OOPSConcept;

public class WrapperClass {

	public static void main(String[] args) {
		
		String i = "100";
		System.out.println(i+20);
		Integer p = Integer.parseInt(i);
		System.out.println(p+20);
		
		String j = "20.5";
		Double d = Double.parseDouble(j);
		System.out.println(d+4.5);
		
		int k = 250;
		String s = String.valueOf(k);
		System.out.println(s+25);
		
		String l = "true";
		boolean b = Boolean.parseBoolean(l);
		System.out.println(b);
		
		

	}

}

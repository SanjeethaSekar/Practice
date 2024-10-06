package HelloWorld;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		int i[] = new int[5];
		
		i[0] = 5;
		i[1] = 10;
		i[2] = 15;
		i[3] = 20;
		i[4] = 25;
		
		System.out.println(i[3]);
		System.out.println(i[2]+i[3]);
		
		
		System.out.println(i.length);
		
		for(int j=0; j<i.length; j++)
		
		{
			System.out.println(i[j]);
		}
		
		char c [] = new char[3];
		c[0] = 'a';
		c[1] = 2;
		c[2] = '$';
		
		boolean b [] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		String s[] = new String[4];
		s[0] = "Vignesh";
		s[1] = "is";
		s[2] = "learning";
		s[3] = "selenium";
		
		double d[] = new double[3];
		d[0] = 2.5;
		d[1] = 3.5;
		d[2] = 4.5;
		
	// object array -- here object is a class and not datatype but it is used to store different data types	
		Object ob[] = new Object[5];
		ob[0] = "Vignesh";
		ob[1] = 'M';
		ob[2] = "12/08/1986";
		ob[3] = 38;
		ob[4] = 5.7;
		
		System.out.println(ob.length);
		
		
		
		
		

		

	}

}

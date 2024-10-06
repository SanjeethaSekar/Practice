package HelloWorld;

public class TwoDimArray {

	public static void main(String[] args) {
	
		String a[][] = new String[3][5];
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
	a[0][0] = "One";
	a[0][1] = "Two";
	a[0][2] = "Three";
	a[0][3] = "Four";
	a[0][4] = "Five";
	
	a[1][0] = "six";
	a[1][1] = "seven";
	a[1][2] = "eight";
	a[1][3] = "Nine";
	a[1][4] = "Ten";
	
	a[2][0] = "Eleven";
	a[2][1] = "Twelve";
	a[2][2] = "Thirteen";
	a[2][3] = "Fourteen";
	a[2][4] = "Fifteen";
	System.out.println(a[1][2]);
	System.out.println("**************");
	for(int row = 0; row<a.length; row++) {
		for(int col = 0; col<a[0].length; col++)
	{
		System.out.println(a[row][col]);
	}
	}

	}

}

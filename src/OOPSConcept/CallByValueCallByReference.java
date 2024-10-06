package OOPSConcept;

public class CallByValueCallByReference {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValueCallByReference obj = new CallByValueCallByReference();
		int x = 10;
		int y= 20;
		int d = obj.sum(x,y);
		System.out.println(d);
		
		obj.p= 55;
		obj.q= 45;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		}

	
	public int sum(int a, int b) {
		 a = 25;
		 b = 35;
		int c= a+b;
		return c;
		
	}
	
	public void swap(CallByValueCallByReference t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
	}
}

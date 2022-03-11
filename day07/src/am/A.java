package am;

public class A {
	public int a;
	protected int b;
	int c; // default
	private int d;
	
	public int m = 3;
	public int n = 4;
	public void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("import");
	}
	
	public static void main(String[] args) {
		
	}
}

class B{
	int m = 3;
	int n = 4;
	
	void print() {
		System.out.println(m + " " + n);
	}
}

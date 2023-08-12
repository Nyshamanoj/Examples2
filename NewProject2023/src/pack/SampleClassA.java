package pack;

public class SampleClassA {
	//within the class
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=50;
	
	private void printA() {
		System.out.println("print A");
	}
	void printB() {
		System.out.println("print B");
	}
	protected void printC() {
		System.out.println("print c");
	}
	public void printD() {
		System.out.println("print D");
	}

	public static void main(String[] args) {
		SampleClassA a=new SampleClassA();
		a.printA();
		a.printB();
		a.printC();
		a.printD();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		
	}

}

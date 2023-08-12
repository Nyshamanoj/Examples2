package pack;

public class SampleClassB {
	//within package outside class
	public int a=10;
	public void printE() {
		System.out.println("print E");
	}

	public static void main(String[] args) {
		SampleClassB vv=new SampleClassB();
		System.out.println(vv.a);
		vv.printE();
		SampleClassA bb=new SampleClassA();
		bb.printB();
		bb.printC();
		bb.printD();
		System.out.println(bb.b);
		System.out.println(bb.c);
		System.out.println(bb.d);
		
		
	}
	

}

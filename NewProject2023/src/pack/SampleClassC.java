package pack;
import pack.SampleClassA;
import pack.SampleClassB;

public class SampleClassC {
	//outside package
	public int s=90;
	
	public void printF() {
		System.out.println("print F");
	}
	

	public static void main(String[] args) {
		SampleClassA a=new SampleClassA();
		System.out.println(a.d);
		a.printD();
		SampleClassB bb=new SampleClassB();
		bb.printE();
		System.out.println(bb.a);
		SampleClassC cc=new SampleClassC();
		System.out.println(cc.s);
		cc.printF();
	}

}

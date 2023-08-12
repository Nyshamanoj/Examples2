package pack;

public class SingleInheritanceB extends SingleInheritanceA {
	public void methodB() {
		System.out.println("Method in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleInheritanceB bb=new SingleInheritanceB();
		bb.methodB();
		bb.methodA();
		System.out.println(bb.a);

	}

}

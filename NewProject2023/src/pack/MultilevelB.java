package pack;

public class MultilevelB extends MultilevelA{
	public void printB() {
		System.out.println("print B");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelB bb=new MultilevelB();
		bb.printA();
		bb.printB();

	}

}

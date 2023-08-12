package pack;

public class MultilevelC extends MultilevelB{
	public void printC() {
		System.out.println("print C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelC cc=new MultilevelC();
		cc.printA();
		cc.printB();
		cc.printC();
		System.out.println(cc.a);

	}

}

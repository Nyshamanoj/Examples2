package pack;

public class HierarchichalClassC extends HierarchichalClassA{
	public void printHierC() {
		System.out.println("print C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchichalClassC cc=new HierarchichalClassC();
		cc.printHierA();
		cc.printHierC();
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.c);

	}

}

package pack;

public class HierarchichalClassB extends HierarchichalClassA{
	public void printInheirB() {
		System.out.println("print B");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchichalClassB bb=new HierarchichalClassB();
		bb.printHierA();
		bb.printInheirB();

	}

}

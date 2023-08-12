package pack;

public class SuperKeywordChild2 extends SuperKeywordParent2 {
	public void set() {
		System.out.println("child class");
	}
	public void display() {
		set();
		super.set();//parent class method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperKeywordChild2 c=new SuperKeywordChild2();
		c.display();

	}

}

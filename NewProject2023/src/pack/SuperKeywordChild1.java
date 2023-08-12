package pack;

public class SuperKeywordChild1 extends SuperKeywordParent1 {
	String color="Black";
	
	public void display() {
		System.out.println(color);
		System.out.println(super.color);//calling parent class instance variable
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		SuperKeywordChild1 c=new SuperKeywordChild1();
		c.display();

	}

}

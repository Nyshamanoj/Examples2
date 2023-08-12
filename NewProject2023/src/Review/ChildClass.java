package Review;

public class ChildClass extends ParentClass {
	public void display() {
		System.out.println("this is child class");
		super.display();
		
	}

	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		
		obj.display();

	}

}

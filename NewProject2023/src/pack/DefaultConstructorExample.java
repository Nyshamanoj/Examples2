package pack;

public class DefaultConstructorExample {
	int rollno;
	String name;
	public DefaultConstructorExample() {
		rollno=13;
		name="Nysha";
	}
	public static void main(String[] args) {
		DefaultConstructorExample obj=new DefaultConstructorExample();
		System.out.println("Rollno:"+obj.rollno);
		System.out.println("Name:"+obj.name);

				
	}

}

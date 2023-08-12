package pack;

public class ParameterizedConstructorExample {
	int rollno;
	String name;
	public ParameterizedConstructorExample(int r,String n) {
		rollno=r;
		name=n;
	}

	public static void main(String[] args) {
		ParameterizedConstructorExample obj=new ParameterizedConstructorExample(13,"Nysha");
		System.out.println(obj.rollno);
		System.out.println(obj.name);
	}

}

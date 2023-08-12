package Review;

public class ConstructorExample {
	int rollno;
	String name;
	public ConstructorExample(int r,String n) {
		this.rollno=r;
		this.name=n;
	}
	public static void main(String[] args) {
		ConstructorExample obj=new ConstructorExample(33,"Nysha");
		System.out.println(obj.rollno);
		System.out.println(obj.name);
				
			
			
			
		}

	}



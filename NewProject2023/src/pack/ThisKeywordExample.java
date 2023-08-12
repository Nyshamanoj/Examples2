package pack;

public class ThisKeywordExample {
	int rollno;
	String name;
	public ThisKeywordExample(int rollno,String name) {
		rollno=rollno;
		name=name;
	}

	public static void main(String[] args) {
		ThisKeywordExample obj=new ThisKeywordExample(33,"Nysha");
		System.out.println(obj.rollno);
		System.out.println(obj.name);
		

	}

}

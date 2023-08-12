package pack;

public class ThisKeywordExample1 {
	int rollno;
	String name;
	public ThisKeywordExample1(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}


	public static void main(String[] args) {
		ThisKeywordExample1 obj=new ThisKeywordExample1(33,"Nysha");
		System.out.println(obj.rollno);
		System.out.println(obj.name);
		

		

	}

}

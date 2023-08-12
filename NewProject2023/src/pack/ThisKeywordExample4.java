package pack;

public class ThisKeywordExample4 {
//call a default constructor from a parameterized constructor	
	public ThisKeywordExample4(int a,String b) {
		this();
		System.out.println(a+"\n"+b);
	}
	public ThisKeywordExample4() {
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		ThisKeywordExample4 obj=new ThisKeywordExample4(33,"Nysha");
		
	}

}

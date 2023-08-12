package pack;

public class ThisKeywordExample3 {
	//call a parameterized constructor from default constructor
	public ThisKeywordExample3() {
		this(50,50);
		System.out.println("Parameterised constructor");
	}
	public ThisKeywordExample3(int a,int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisKeywordExample3 obj=new ThisKeywordExample3();
		
	}

}

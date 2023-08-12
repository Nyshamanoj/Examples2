package pack;

public class ThisKeywordExample2 {
	public void run() {
		display();
		
	//or
	this.display();
	}
	public void display() {
		System.out.println("Display");
	}

	public static void main(String[] args) {
		ThisKeywordExample2 obj=new ThisKeywordExample2();
		obj.run();
	}

}

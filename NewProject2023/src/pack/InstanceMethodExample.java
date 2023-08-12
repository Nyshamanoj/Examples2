package pack;

public class InstanceMethodExample {
	public int addNumbers() {
		int a=100,b=100;
		int sum=a+b;
		return sum;
	}
	public int addNumbers(int a,int b,int c) {
		int sum=a+b+c;
		return sum;
		
	}

	public static void main(String[] args) {
		InstanceMethodExample obj=new InstanceMethodExample();
		int x=obj.addNumbers();
		System.out.println(x);
		int y=obj.addNumbers(100, 100, 100);
		System.out.println(y);
		

	}

}

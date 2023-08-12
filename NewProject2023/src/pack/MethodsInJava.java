package pack;

public class MethodsInJava {
	//static method without parameter
	public static void addTwoNumbers() {//method signature
		int a=10;int b=20;
		int sum=a+b;
		System.out.println("Sum is:"+sum);
	}
	public static int addThreeNumbers() {
		int a=10;int b=20;int c=30;
		int sum1=a+b+c;
		return sum1;
	}

	public static void main(String[] args) {
		//calling a static method
		MethodsInJava.addTwoNumbers();
		//or
		addTwoNumbers();
		int s=MethodsInJava.addThreeNumbers();
		System.out.println("Sum of three numbers is:"+s);
		addThreeNumbers();
		
	}

}

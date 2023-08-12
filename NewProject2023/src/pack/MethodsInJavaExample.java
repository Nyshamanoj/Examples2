package pack;

public class MethodsInJavaExample {
	//static method with parameter
			public static int addTwoNumbers(int a,int b) {
				int sum=a+b;
				return sum;
			}
	public static void main(String[] args) {
		int s=MethodsInJavaExample.addTwoNumbers(10, 20);
		System.out.println("Sum is"+s);
		//or
		int s1=addTwoNumbers(20, 40);
		System.out.println("Sum is"+s1);
		
		
	}

}

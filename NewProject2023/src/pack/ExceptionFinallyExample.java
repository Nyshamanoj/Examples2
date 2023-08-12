package pack;

public class ExceptionFinallyExample {

	public static void main(String[] args) {
		try {
			int c=10/0; //infinity
			System.out.println(c);
			}
		finally {
			System.out.println("Finally block");
		}
		//catch (ArithmeticException e) {
			//System.out.println("Exception Handled");
		//}
			int a=10,b=20;
			int sum=a+b;
			System.out.println(sum);

	}

}

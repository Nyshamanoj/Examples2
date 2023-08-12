package pack;

public class CommandLineAdditionExample {

	public static void main(String[] args) {
		//string to integer
		//first method
		int a=Integer.valueOf(args[0]);
		int b=Integer.valueOf(args[1]);
		int sum=a+b;
		System.out.println("Sum is:"+sum);
		//second method
		int c=Integer.parseInt(args[0]);
		int d=Integer.parseInt(args[1]);
		int sum1=c+d;
		System.out.println("Sum is:"+sum1);
		//third method
		//integer to string
		int i=10;
		String s=String.valueOf(i);
		System.out.println(s);
		
		

	}

}

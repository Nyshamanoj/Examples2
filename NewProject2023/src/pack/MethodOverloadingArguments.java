package pack;

public class MethodOverloadingArguments {
	//By changing the no of arguments
	public static void addNumbers(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void addNumbers(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		MethodOverloadingArguments.addNumbers(10, 20,30);
		MethodOverloadingArguments.addNumbers(10, 20);
		
				}

	}



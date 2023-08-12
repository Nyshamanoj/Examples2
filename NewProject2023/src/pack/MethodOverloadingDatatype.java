package pack;

public class MethodOverloadingDatatype {
	//By changing the data type
	public static void addNumbers(int a,float b) {
		System.out.println(a+b);
	}
	public static void addNumbers(int a,double b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		MethodOverloadingDatatype.addNumbers(10,10.3f);
		MethodOverloadingDatatype.addNumbers(10,100.14);
		
		
	}

}

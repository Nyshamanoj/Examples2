package pack;

public class ExceptionExample  {
	public void printData01()  {
		try {
			printData02();
		}
		catch (Exception e) {
			System.out.println("Exception handled");
		}
	}
    public void printData02() throws ArithmeticException {
		printData03();
	}
   public void printData03()throws ArithmeticException {
	int a=10/0;
	System.out.println("value of a:"+a);
	throw new ArithmeticException();
}


	public static void main(String[] args) {
		ExceptionExample obj=new ExceptionExample();
		obj.printData01();
		
	}

}

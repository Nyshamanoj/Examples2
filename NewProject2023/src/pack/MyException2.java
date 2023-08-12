package pack;

public class MyException2 {
	public void printData01() throws MyException{
		int balance=10000;
		int withdraw=11000;
		if(withdraw>balance) {
			throw new MyException("Insufficient Balance");
		}
	}

	public static void main(String[] args) {
		MyException2 obj=new MyException2();
		try {
			obj.printData01();
		}
		catch(MyException e) {
			System.out.println("Exception Handled");
			
		}
		}
	}

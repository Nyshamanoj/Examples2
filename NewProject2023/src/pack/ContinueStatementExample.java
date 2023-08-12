package pack;

public class ContinueStatementExample {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i==6) {
				continue;
			}
			System.out.println("Value of i is:"+i);
			}
		System.out.println("Rest of the statement");

	}

}

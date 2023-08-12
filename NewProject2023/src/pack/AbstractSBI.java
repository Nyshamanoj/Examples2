package pack;

public class AbstractSBI extends AbstractBank {
	@Override
	int getInterest() {
		
		return 3;
	}
	public static void main(String[] args) {
		AbstractBank obj=new AbstractSBI();
		int b=obj.getInterest();
		System.out.println("Interest Rate of SBI:" +b);
		//obj.display();
		//or
		AbstractSBI ss=new AbstractSBI();
		int c=ss.getInterest();
		System.out.println(c);
	}

}

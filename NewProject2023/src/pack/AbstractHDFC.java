package pack;

public class AbstractHDFC extends AbstractBank{
	@Override
	int getInterest() {
		return 2;
	}
	public static void main(String[] args) {
	//AbstractBank b=new AbstractBank();//we can't instantiate an abstract class
		AbstractBank b=new 	AbstractHDFC();
	int a=b.getInterest();
	System.out.println("Interest Rate of HDFC:" +a);
	b.display();
	//or
	AbstractHDFC ss=new AbstractHDFC();
	int c=ss.getInterest();
	System.out.println(c);
		}

	
}

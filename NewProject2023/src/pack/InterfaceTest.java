package pack;

public class InterfaceTest implements InterfacePrintable{
	@Override
	public void print() {
		System.out.println("printing");
		
	}

	@Override
	public void show() {
		System.out.println("show");
		
	}


	public static void main(String[] args) {
		InterfacePrintable p=new 	InterfaceTest();
		p.print();
		p.show();
		//or
		InterfaceTest t=new InterfaceTest();
		t.print();
		t.show();
		}
	}

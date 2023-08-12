package pack;

public class InterfaceRun implements InterfaceC{
	@Override
	public void printA() {
		System.out.println("print A");		
	}

	@Override
	public void printB() {
		System.out.println("print B");		
		}

	@Override
	public void printC() {
		System.out.println("print C");		
		}
	public static void main(String[] args) {
		InterfaceRun r=new InterfaceRun();
		r.printA();
		r.printB();
		r.printC();
		}
	}

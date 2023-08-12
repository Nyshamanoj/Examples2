package pack;

public class InterfaceTestable implements InterfaceReadable,InterfaceShowable {
	@Override
	public void show() {
		System.out.println("show...");
		}

	@Override
	public void read() {
		System.out.println("read....");
	}
	@Override
	public void msg() {
		System.out.println("message...");
	}
		public static void main(String[] args) {
			InterfaceReadable r=new InterfaceTestable();
			r.read();
			r.msg();
			//or
			InterfaceShowable s=new InterfaceTestable();
			s.show();
			s.msg();
			//or
			InterfaceTestable t=new InterfaceTestable();
			t.read();
			t.show();
			t.msg();
			
			}

	
}

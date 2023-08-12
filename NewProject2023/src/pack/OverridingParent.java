package pack;

public class OverridingParent extends OverridingChild {
	public void run() {
		System.out.println("Child class Running");
	}


	public static void main(String[] args) {
		
		OverridingParent obj=new OverridingParent();
		obj.run();
		
	}

}

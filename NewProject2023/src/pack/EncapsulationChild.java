package pack;

public class EncapsulationChild {
	private int rollno;
	private String name;
	
	public void setDetails(int r,String n) {
		rollno=r;
		name=n;
		
	}
	public void getDetails() {
		System.out.println("Rollno:" +rollno);
		System.out.println("Name:" +name);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

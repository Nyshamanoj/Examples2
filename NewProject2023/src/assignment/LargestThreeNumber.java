package assignment;

public class LargestThreeNumber {

	public static void main(String[] args) {
		int x=10;int y=20;int z=30;
		if(x>y&&x>z) {
			System.out.println("Largest number is x:"+x);
		}
		else if(y>x&&y>z) {
			System.out.println("Largest number is y:"+y);
		}
		else if(z>x&&z>y) {
			System.out.println("Largest number is z:"+z);
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Rest of the statement");
		
	}

}

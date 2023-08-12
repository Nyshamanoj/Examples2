package assignment;

public class SwapNumbersWithTemp {

	public static void main(String[] args) {
		int x=100;
		int y=200;
		System.out.println("Before Swapping");
		System.out.println("Value of x:"+x);
		System.out.println("Value of y:"+y);
		int z=x;//z=100
		x=y;//x=200
		y=z;//y=100
		System.out.println("After Swapping");
		System.out.println("Value of x:"+x);
		System.out.println("Value of y:"+y);

	}
	

}

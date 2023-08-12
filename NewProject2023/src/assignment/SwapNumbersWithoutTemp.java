package assignment;

public class SwapNumbersWithoutTemp {

	public static void main(String[] args) {
	int x=100;
	int y=200;
	System.out.println("Before Swapping");
	System.out.println("Value of x:"+x);
	System.out.println("Value of y:"+y);
	x=x+y;//x=100+200=>x=300
	y=x-y;//y=300-200=>y=100
	x=x-y;//x=300-100=>x=200
	System.out.println("After Swapping");
	System.out.println("Value of x:"+x);
	System.out.println("Value of y:"+y);
	
	}

}

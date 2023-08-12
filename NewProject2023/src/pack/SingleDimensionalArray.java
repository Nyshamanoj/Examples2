package pack;
import java.util.Scanner;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		//instantiation
		int arr[]=new int[5];
		//initialization
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
		//reading from keyboard
		Scanner sc=new Scanner(System.in);
		int brr[]=new int[5];
		brr[0]=sc.nextInt();
		brr[1]=sc.nextInt();
		brr[2]=sc.nextInt();
		brr[3]=sc.nextInt();
		brr[4]=sc.nextInt();
		for(int i=0;i<brr.length;i++) {
			System.out.println(brr[i]);
		}
		//we can declare,instantiate and initialize in single line
		int crr[]= {1,45,78,23,56};
		for(int i=0;i<crr.length;i++) {
			System.out.println(crr[i]);
		}
		//another method
		int drr[]=new int[5];
		for(int i=0;i<drr.length;i++) {
			drr[i]=sc.nextInt();
		}
		for(int i=0;i<drr.length;i++) {
			System.out.println(drr[i]);

		}
		}
}



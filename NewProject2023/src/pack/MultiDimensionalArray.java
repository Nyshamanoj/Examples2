package pack;
import java.util.Scanner;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=30;
		a[1][1]=40;
		a[1][2]=28;
		a[2][0]=40;
		a[2][1]=60;
		a[2][2]=26;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		//declare,instantiate and initialize in single line
		int b[][]= {{1,5,6},{10,20,30},{39,18,15}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		//reading input from keyboard
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int coloumn=sc.nextInt();
		int c[][]=new int [row][coloumn];
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloumn;j++) {
				c[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		}

}

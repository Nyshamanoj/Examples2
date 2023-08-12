package pack;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		int a[][]=new int [3][2];
		a[0][0]=10;
		a[0][1]=18;
		a[1][0]=20;
		a[1][1]=25;
		a[2][0]=30;
		a[2][1]=29;
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		//declare,instantiate and initialize in single line
		int b[][]= {{1,5},{3,4},{2,6}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}


	}

}

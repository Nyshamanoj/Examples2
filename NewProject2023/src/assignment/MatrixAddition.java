package assignment;

public class MatrixAddition {

	public static void main(String[] args) {
		int a[][]= {{1,5,4},{3,4,2},{2,6,7}};
		int b[][]= {{2,6,3},{1,5,8},{3,4,9}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" \t ");
			}
			System.out.println();
			}
		}
		
	}



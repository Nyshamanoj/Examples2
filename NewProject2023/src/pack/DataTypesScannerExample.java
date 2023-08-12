package pack;
import java.util.Scanner;

public class DataTypesScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		byte b=sc.nextByte();
		short s=sc.nextShort();
		int a=sc.nextInt();
		long l=sc.nextLong();
		float f=sc.nextFloat();
		double d=sc.nextDouble();
		boolean b1=sc.nextBoolean();
		String s1=sc.next();
		String s2=sc.nextLine();
		System.out.println(b);
		System.out.println(s);
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(s2);
	}

}

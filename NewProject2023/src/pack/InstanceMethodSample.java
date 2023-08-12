package pack;

public class InstanceMethodSample {
	public int addNumbers(int a,int b) {
		int sum=a+b;
		return sum;
	}
	public int subNumbers(int a,int b) {
		int diff=a-b;
		return diff;
	}
	public int mulNumbers(int a,int b) {
		int mul=a*b;
		return mul;
	}
	public int divNumbers(int a,int b) {
		int div=a/b;
		return div;
	}
	public static void main(String[] args) {
		InstanceMethodSample obj=new InstanceMethodSample();
		int w=obj.addNumbers(10, 10);
		System.out.println("Addition:"+w);	
		int x=obj.subNumbers(10, 10);
		System.out.println("Subtraction:"+x);	
		int y=obj.mulNumbers(10, 10);
		System.out.println("Multiplication:"+y);
		int z=obj.divNumbers(10, 10);
		System.out.println("Division:"+z);	
		}
	}

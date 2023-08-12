package pack;

public class FloatIntStaticWithParameter {
	public static float addFloatIntNumbers(int a,float b) {
		float sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		float s=FloatIntStaticWithParameter.addFloatIntNumbers(10,20.2f);
		System.out.println("Sum is"+s);
		//or
		float s1=addFloatIntNumbers(10,20.2f);
		System.out.println("Sum is"+s1);

		

	}

}

package pack;

public class FloatIntStaticWithoutParameter {
	public static float addFloatIntNumbers() {
		int a=10;
		float b=10.3f;
		float sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		float s=FloatIntStaticWithoutParameter.addFloatIntNumbers();
		System.out.println("Sum is:"+s);
		addFloatIntNumbers();
		
	}

}

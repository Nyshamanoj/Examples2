package pack;

public class MultipleC extends MultipleA,MultipleB{
	public void msg() {
		System.out.println("Message in C");
	}
	
	public static void main(String[] args) {
		MultipleC cc=new MultipleC();
		cc.ms /*compiler will not identify
		which method in which parent class is calling.
		To resolve this issue,in java one class can't extend
		 more than one class at at time*/
		

		

	}

}

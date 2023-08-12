package pack;

public class MethodOverloadingParameter {
	//By changing order of parameter

	
		public static void addNumbers(int a,float b) {
			System.out.println(a+b);
		}
		public static void addNumbers(float a,int b) {
			System.out.println(a+b);
		}


		public static void main(String[] args) {
			MethodOverloadingParameter.addNumbers(10.234f, 145);
			MethodOverloadingParameter.addNumbers(100, 168.9f);


	}

}

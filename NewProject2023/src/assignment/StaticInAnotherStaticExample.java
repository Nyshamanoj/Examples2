package assignment;

public class StaticInAnotherStaticExample {
	static String name;
	static int age;

	public static void setYourNameAndAge() {
		name="Nysha";
		age=25;
			
	}
public static void getYourNameAndAge() {
	System.out.println(name);
	System.out.println(age);
		
	}


	public static void main(String[] args) {
		setYourNameAndAge();	
		getYourNameAndAge();		
	}

}

package Review;

public class ReviewProgram {
	int age;
	String name;
	
	public ReviewProgram (int a,String nme) {
		age=a;
		name=nme;
		
	}
			
	
		public void display() {
			System.out.println("Age:"+age);
			System.out.println("Name:"+name);
		
		
			}
				 

	public static void main(String[] args) {
		ReviewProgram obj=new ReviewProgram(11,"Nysha");
		obj.display();
		ReviewProgram obj1=new ReviewProgram(12,"Nim");
		obj1.display();
				
		
		
					}

}

package assignment;

public class GradeExample {

	public static void main(String[] args) {
		int marks=75;
		if(marks<40) {
		System.out.println("Failed");	
		}
		else if(marks>=40&&marks<=60) {
			System.out.println("D grade");
		}
		else if(marks>=61&&marks<=70) {
			System.out.println("C grade");
		}
		else if(marks>=71&&marks<=80) {
			System.out.println("B grade");
		}
		else if(marks>=81&&marks<=10) {
			System.out.println("A grade");
		}
		else {
			System.out.println("Invalid");
		}
		System.out.println("Rest of the statement");

			
		}

}

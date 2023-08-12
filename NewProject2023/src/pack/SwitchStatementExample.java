package pack;

public class SwitchStatementExample {

	public static void main(String[] args) {
		String s="Friday";
		switch(s) {
		case "Monday":
			System.out.println("First day");
			break;
		case "Tuesday":
			System.out.println("Second day");
			break;
		case "Wednesday":
			System.out.println("Third day");
			break;
		case "Thursday":
			System.out.println("Fourth day");
			break;
		case "Friday":
			System.out.println("Fifth day");
			break;
		case "Saturday":
			System.out.println("Sixth day");
			break;
		case "Sunday":
			System.out.println("Seventh day");
			break;
			default:
				System.out.println("Invalid");
		}
		System.out.println("Rest of the statement");
		}

	}



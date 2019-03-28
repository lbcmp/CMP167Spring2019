import java.util.Scanner;
public class DMV {

	static Scanner scnr = new Scanner(System.in);
	
	public static void generateDL(int age, boolean testPass) {
		if (testPass == true && age >= 17) {
			System.out.println("DL generated");
			/* System.out.println("What year is it?");
			int yearGenerated = scnr.nextInt();
			System.out.println("Your license will expire in " + calculateExpirationDate(yearGenerated) + ".");
		*/
		}
		else {
			System.out.println("Cannot generate DL");
		}
		}
	
	public static int calculateExpirationDate(int yearGenerated) {
		return yearGenerated + 10;
	}
	
	public static void main(String[] args) {
		int age;
		boolean testPass;
		
		System.out.println("Welcome. This program will tell you the expiration date for your license given that you are"
				+ " the appropriate age and you passed your drivers test.");
		
		System.out.println("Please enter your age.");
		age = scnr.nextInt();
		
		System.out.println("Did you pass your drivers test? (Y/N)");
		String userInput = scnr.next();
		if (userInput.equalsIgnoreCase("Y")) {
			testPass = true;
		}
		else {
			testPass = false;
		}
		
		generateDL(age, testPass);
		
	}

}

import java.util.Scanner;
public class Review {

	static Scanner scnr = new Scanner(System.in);
	
	public static void Greeting() {
		System.out.println("Welcome.");
	}
	
	public static void userName() {
		Greeting();
		System.out.println("Please print your name.");
		String name = scnr.next();
		if ((name.charAt(name.length() - 1) == 'a') || ((name.charAt(name.length() - 1) == 'e')) ) {
			System.out.println("Miss " + name);
		}
		else {
			System.out.println("Mister " + name);
		}
	}
	
	public static void numPeople(int s) {
		for (int i = 1; i <= s; ++i) {
			userName();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter a number");
		int s = scnr.nextInt();
		numPeople(s);
	}

}

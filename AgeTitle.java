/*
 * Author: Leah Benitez
 * Desc: This program will take the user's age and tell them what age group they are in.
 * Created: 2/21/2019
 */

import java.util.Scanner;

public class AgeTitle {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter your age.");
		int userAge = scnr.nextInt();
		
		if (userAge > 25) {
			System.out.println("Adult");
		}
		
		else if ((userAge >= 19) && (userAge <= 25)) {
			System.out.println("Young Adult");
	}
		else {
			System.out.println("Teen");
		}

}
}
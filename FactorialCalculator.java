/*
 * Name: Leah Benitez
 * Desc: This program calculates the factorial of n. n is provided by the user.
 * Date: 3/7/19
 */

import java.util.Scanner;
public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome. This program calculates the factorial of n.");
		System.out.println("Please enter natural number (n): ");
		int n = scnr.nextInt();
		int i;
		int factorial = 1;
		
		for (i = 1; i <= n; ++i) {
			factorial *= i;
		}
		
		System.out.println(factorial);
	}

}

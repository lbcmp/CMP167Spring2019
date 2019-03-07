/*
 * Name: Leah Benitez
 * Desc: This program calculates the first nth powers of 2. n is provided by the user.
 * Date: 3/7/19
 */

import java.util.Scanner;

public class PowersOfTwo {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome. This program will calculate the first nth powers of 2.");
		System.out.println("Please enter natural number (n): ");
		int n = scnr.nextInt();
		int i;
		int powOfTwo = 1;
		
		
		for (i = 1; i <= n; ++i) {
			powOfTwo *= 2;
			System.out.println(powOfTwo);
		}
		
	}
}

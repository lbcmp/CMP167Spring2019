/*
 * Name: Leah Benitez
 * Desc: This program gets the average of all the numbers leading up to, and including, n. n is provided by the user.
 * Date: 3/7/19
 */

import java.util.Scanner;
public class AverageCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("This program calculates the average of all the numbers leading up to, and including, n.");
		System.out.println("Please enter natural number (n): ");
		int n = scnr.nextInt();
		int i;
		int sum = 0;
		int avg;
		
		for (i = 1; i <= n; ++i) {
			sum += i;
		}
		avg = sum / n;
		System.out.println(avg);
	}

}

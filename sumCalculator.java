/*
 * Author: Leah Benitez
 * Desc: This program prints the sum of all natural numbers leading up to (and including) whatever natural number the user provides.
 * Created: 3/5/19
 * 
 */

import java.util.Scanner;

public class sumCalculator {
	
	public static void main(String [] args) {
		Scanner scnr = new Scanner(System.in);
		
		int counter = 0;
		int n;
		int sum = 0;
		
		System.out.println("Please enter a natural number (n):");
		n = scnr.nextInt();
		
		while (counter < n) {
			counter++;
			sum += counter;
		}
		System.out.println("The sum is: " + sum);
		
	}

}

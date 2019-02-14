/*
 * Author: Leah Benitez
 * Created: 2/14/19
 * Desc: This program plugs variables provided by the user into the quadratic formula.
 */

import java.util.Scanner;

public class quadForm {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		double discriminant;
		
		System.out.println("Please enter the value of a.");
		double varA = scnr.nextDouble();
		System.out.println("Please enter the value of b.");
		double varB = scnr.nextDouble();
		System.out.println("Please enter the value of c.");
		double varC = scnr.nextDouble();
		
		discriminant = Math.pow(varB, 2) - (4 * varA * varC);
		double root1 = (-varB + Math.sqrt(discriminant))/ (2.0 * varA);
		double root2 = (-varB - Math.sqrt(discriminant))/ (2.0 * varA);
		
		System.out.println("The root 1 is " + root1);
		System.out.println("The root 2 is " + root2);
		

	}

}

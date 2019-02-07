/* 
 * Author: Leah Benitez
 * Created: 2/7/2019
 * Desc: This is a program that calculates the average of three numbers provided by the users.
 */

package test0;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Please enter three numbers.");
		
		Scanner scnr = new Scanner(System.in);
		
		double num1 = scnr.nextDouble();
		double num2 = scnr.nextDouble();
		double num3 = scnr.nextDouble();
		
		double average = num1 + num2 + num3;
		average = average / 3;
		
		System.out.print("The average of these three numbers is " + average);
		
	}

}

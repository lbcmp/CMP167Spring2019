/*
 * Area.java
 * Name: Leah Benitez
 * Desc: This program implements area functions/method
 * Date: 3/12/19
 */

import java.util.Scanner;
public class Area {
	static Scanner scnr = new Scanner(System.in);
	
	/*
	 * RectArea: int
	 * Parameters: width, length
	 * Calculates rectangle area
	 */
	public static int RectArea(int width, int length) {
		return width * length;
	}
	
	/*
	 * CircleArea: double
	 * Parameter: radius
	 * Calculates circle area
	 */
	public static double CircleArea(double radius) {
		return (Math.PI * Math.pow(radius, 2));
	}
	
	/*
	 * RectArea: double
	 * Parameters: base, height
	 * Calculates triangle area
	 */
	public static double TriArea(double base, double height) {
		return (base * height) / 2;
	}

		public static void main(String[] args) {
			System.out.println("Let's calculate the area of a rectangle");
			System.out.println("Enter width:");
			int width = scnr.nextInt();
			System.out.println("Enter length:");
			int length = scnr.nextInt();
			int areaRect = RectArea(width, length);
			System.out.println("The area is " + areaRect + "\n");
			
			System.out.println("Let's calculate the area of a circle");
			System.out.println("Enter radius:");
			double radius = scnr.nextInt();
			double areaCirc = CircleArea(radius);
			System.out.println("The area is " + areaCirc + "\n");
			
			System.out.println("Let's calculate the area of a triangle");
			System.out.println("Enter base:");
			double base = scnr.nextDouble();
			System.out.println("Enter height:");
			double height = scnr.nextDouble();
			double areaTri = TriArea(base, height);
			System.out.println("The area is " + areaTri + "\n");
			
		}
}

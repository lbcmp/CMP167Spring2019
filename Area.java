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
	 * Method: RectArea()
	 * Input: width, length
	 * Process: area = l * w
	 * Output: area
	 */
	public static void RectArea() {
		System.out.println("Let's calculate the area of a rectangle");
		
		System.out.println("Enter width:");
		int width = scnr.nextInt();
		System.out.println("Enter length:");
		int length = scnr.nextInt();
		int area = width * length;
		System.out.println("The area is " + area + "\n");
	}
	
	/*
	 * Method: CircleArea()
	 * Input: radius
	 * Process: area = pi * r^2
	 * Output: area
	 */
	public static void CircleArea() {
		System.out.println("Let's calculate the area of a circle");
		
		System.out.println("Enter radius:");
		double radius = scnr.nextInt();
		double areaCircle = Math.PI * Math.pow(radius, 2);
		System.out.println("The area is " + areaCircle + "\n");
	}
	
	/* 
	 * Method: TriArea()
	 * Input: base, height
	 * Process: area = (b * h) / 2
	 * Output: area
	 */
	public static void TriArea() {
		System.out.println("Let's calculate the area of a triangle");
		
		System.out.println("Enter base:");
		double base = scnr.nextDouble();
		System.out.println("Enter height:");
		double height = scnr.nextDouble();
		double areaTri = (base * height) / 2;
		System.out.println("The area is " + areaTri);
	}

	public static void main(String[] args) {
		RectArea();
		CircleArea();
		TriArea();
	}
}

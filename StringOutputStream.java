/*
 * Author: Leah Benitez
 * Desc: StringOutputStream demo
 * Created: 2/19/19
 */
package week4;
import java.util.Scanner;
import java.io.StringWriter;
import java.io.PrintWriter;

public class StringOutputStream {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		StringWriter fullNameSW = new StringWriter();
		PrintWriter fullNamePW = new PrintWriter(fullNameSW);
		
		
		System.out.println("Please enter: \"firstname lastname\"");
		String firstName = scnr.next();
		String secondName = scnr.next();
		
		fullNamePW.print(secondName + ", " + firstName);
		String fullName = fullNameSW.toString();
		
		System.out.println(fullName);

	}

}

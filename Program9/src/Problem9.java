/*
 *Alex Charpentier
 *Program9
 *Area of a trapezoid calulator 
 */

import java.util.Scanner;
public class Problem9 {

	public static void main(String[] args) {
		
		//Instatiates scanner as in
		Scanner in = new Scanner(System.in);
		
		//declares variables
		double area;
		double height;
		double lengthBottom;
		double lengthTop;
		
		//Informs user the purpose of the program
		System.out.println("Area of a Trapezoid Calculator");
		
		//accepts values from user for the height, bottom base, and top base.
		System.out.print("Enter the height of the trapezoid: ");
		height = in.nextDouble();
		System.out.print("Enter the length of the bottom base: ");
		lengthBottom = in.nextDouble();
		System.out.print("Enter the length of the top base: ");
		lengthTop = in.nextDouble();
		in.close();
		
		//uses the formula for the area of a trapezoid with input values 
		area = .5 * (lengthTop + lengthBottom) * height;
		
		//prints the area of a trapezoid
		System.out.print("The area of the trapezoid is: " + area);
		
	}

}

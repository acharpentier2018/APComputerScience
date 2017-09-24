/*
 * Alex Charpentier
 * Problem8
 * Finds circumference, SA, and volume of a sphere
 */
import java.util.Scanner;
public class Problem8 {

	public static void main(String[] args) {
		//Scanner named "in" decalered
		Scanner in = new Scanner(System.in);
		
		//declares variable
		double radius;
		
		//takes input for radius
		System.out.print("Please input the radius of the sphere: ");
		radius = in.nextDouble();
		in.close();
		
		//prints the circumference of the sphere
		System.out.print("The circumference of the sphere is: ");
		System.out.println(2 * 3.14 * radius);
		
		//prints the surface area of the sphere
		System.out.print("The surface area of the sphere is: ");
		System.out.println(4 * 3.14 * radius * radius);
		
		//prints the volume of the sphere
		System.out.print("The volume of the sphere is: ");
		System.out.println(4 / 3 * 3.14 * radius * radius * radius);
	}
}

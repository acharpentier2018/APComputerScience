/*
 * Alex Charpentier
 * Program10
 * Determines your healthy weight
 */
//Wrote this program before the change. Works well, felt no need to change it. 
import java.util.Scanner;
public class Problem10 {

	public static void main(String[] args) {
		//Scanner instantiated as 'in'
		Scanner in = new Scanner(System.in);
		
		//estblishing variables
		int genderValue;
		int weight;
		int height;
		
		//informs user of the purpose of the program
		System.out.println("Healthy Weight Calculator");
		
		//takes input from the user for gender and height
		System.out.print("Please input '1' for male or '0' for female: ");
		genderValue = in.nextInt();
		System.out.print("Please input height, in inches (must be above 60\"): "); 
		height = in.nextInt();
		in.close();
		
		//Set of equations that satisfy the healthy weight equation
		height = height - 60;
		weight = ((genderValue * 6) + 100) + (height * (genderValue + 6));
		
		//Prints your healthy weight
		System.out.println("Your healthy weight is: " + weight + " lbs");
		
	}
}

/*
 * Alex Charpentier
 * MaxIntegers
 * Determines the maximum of 3 integers
 */
import java.util.Scanner;
public class MaxIntegers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//takes inputs for values a, b, and c
		System.out.print("Insert the first integer: ");
		int a = in.nextInt();
		System.out.print("Insert the second integer: ");
		int b = in.nextInt();
		System.out.print("Insert the third integer: ");
		int c = in.nextInt();
		in.close();
		//prints the largest variable
		System.out.print("The largest integer is: ");
		System.out.println(max( a, b, c));
	}
	
	public static int max(int a, int b, int c) {
		//determines the max of three variables
		int firstMax = Math.max(a, b);
		return Math.max(c, firstMax);
	}
}

/*
 * Alex Charpentier
 * Problem6
 * Prints an image
 */
public class Problem6 {

	public static void main(String[] args) {
		//prints the image
		stars();
		bars();
		thirteenStars();
		stars();
		fiveStars();
		bars();
		bars();
		fiveStars();
		fiveStars();
	}
	public static void stars() {
		//prints 2 trapezoids of stars seperated by a line space
		fiveStars();
		System.out.println("  ********* ");
		thirteenStars();
		nextLine();
		fiveStars();
		System.out.println("  ********* ");
		thirteenStars();
	}
	public static void thirteenStars() {
		//prints thirteen stars
		System.out.println("*************");
	}
	public static void fiveStars() {
		//prints five stars
		System.out.println("    *****  ");
	}
	public static void bars() {
		//prints five vertical bars
		System.out.println("* | | | | | *");
	}
	public static void nextLine() {
		//skips a line
		System.out.println();
	}
}
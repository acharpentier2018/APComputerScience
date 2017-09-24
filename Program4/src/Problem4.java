/*
 * Alex Charpentier
 * Program4
 * Prints a rocket
 */
public class Problem4 {

	public static void main(String[] args) {
		//prints the whole rocket
		cone();
		box();
		text();
		box();
		cone();
	}
	public static void cone() {
		//prints the cone on that appears at the top and bottom of the rocket
		System.out.println("   /\\  ");
		System.out.println("  /  \\ ");
		System.out.println(" /    \\");
	}
	public static void box()  {
		//prints a box that appears above and below the text
		System.out.println("+------+");
		System.out.println("|      |");
		System.out.println("|      |");
		System.out.println("+------+");
	}
	public static void text() {
		//prints the text that appears in the middle of the rocket
		System.out.println("|Hello |");
		System.out.println("| World|");
	}
}

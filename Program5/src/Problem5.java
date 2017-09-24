
public class Problem5 {

	public static void main(String[] args) {
		//prints the entire structure
		lines();
		cross();
		nextLine();
		lines();
		cross();
		lines();
		nextLine();
		threeStars();
		lines();
		cross();
	}
	public static void lines() {
		//prints two horizontal star lines
		System.out.println("*****");
		System.out.println("*****");
	}
	public static void cross() {
		//prints a cross out of stars
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
	}
	public static void threeStars() {
		//prints three verticle stars
		System.out.println("  *  ");
		System.out.println("  *  ");
		System.out.println("  *  ");
	}
	public static void nextLine() {
		//skips a line
		System.out.println();
	}
}

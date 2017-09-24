/*
 * Alex Charpentier
 * Problem3
 * Prints large 'Victory is mine!' box
 */
public class Problem3 {

	public static void main(String[] args) {
		//prints large 'Victory is mine!' box
		top();
		bot();
		bot();
		bot();
		bot();
	}
	
	public static void top() {
		//prints top part of the box
		System.out.println("//////////////////////");
		System.out.println("|| Victory is mine! ||");
		System.out.println("//////////////////////");
	}
	public static void bot() {
		//prints an extension onto the bottom of the box
		System.out.println("|| Victory is mine! ||");
		System.out.println("//////////////////////");
	}
}

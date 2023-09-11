package Placement_Course.Function_Method.Question;

public class Q_6_InfiniteDoWhile {
	public static void main(String[] args) {
		int i = 10;

		do {
			System.out.println("Hello");
			if (i <= 0) {
				break; // Exit the loop when int "i" becomes less than or equal to 0
			}
			i--; // Decrement i in each iteration
		} while (true); // Infinite loop

	}
}

package Placement_Course.Function_Method.Question;

import java.util.Scanner;

public class Q_10_Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the no :");
		int n = scanner.nextInt();

		int a = 0, b = 1;

		System.out.print(a + " ");

		if (n > 1) {
			//find nth term
			for (int i = 2; i <= n; i++) {
				System.out.print(b + " ");
				//the concept below is called swapping
				int temp = b;
				b = a + b;
				a = temp;
			}


			System.out.println();
		}

	}
}
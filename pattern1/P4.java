package Placement_Course.Pattern1;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {

		/*
		 print this pattern ( space loop similar to above P2 , P3 , P5 in same package )

		     1
            2 2
           3 3 3
          4 4 4 4
         5 5 5 5 5

		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = scanner.nextInt();

		for(int i=1; i<=n; i++) {
			//spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			//numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
}

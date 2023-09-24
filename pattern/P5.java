package Placement_Course.Pattern;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {

		/*
		    print this pattern : pyramid

		        *
               **
              ***
             ****
            *****

		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int n = scanner.nextInt();


		for(int i = 1 ; i <= n; i++){
			// space loop
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
				// star loop
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}

			System.out.println();
		}
	}
}

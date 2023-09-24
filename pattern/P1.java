package Placement_Course.Pattern;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		/*
		print this pattern : solid rectangle

		  *****
		  *****
		  *****
		  *****
		  *****

		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int n = scanner.nextInt();
		System.out.println("Enter no of columns");
		int m = scanner.nextInt();

		for(int i = 1; i <= n; i++ ){
			for(int j = 1; j <= m; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

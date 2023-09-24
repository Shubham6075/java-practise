package Placement_Course.Pattern;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {

		/*
		print this pattern : Inverted pyramid

		*****
        ****
        ***
        **
        *

		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int n = scanner.nextInt();


		for(int i = n; i >= 1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

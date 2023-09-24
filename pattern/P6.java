package Placement_Course.Pattern;

import java.util.Scanner;

public class P6 {
	public static void main(String[] args) {

		/*
		   print no pattern pyramid

		   1
           1 2
           1 2 3
           1 2 3 4
           1 2 3 4 5

		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int n = scanner.nextInt();


		for(int i = 1; i <= n; i++){
			for(int j = 1; j <=i; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}


	}
}

package Placement_Course.Array_2d;

import java.util.Scanner;

public class array2 {

	// searching value in matrix

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows :");
		int rows = scanner.nextInt();
		System.out.println("Enter no of columns :");
		int cols = scanner.nextInt();


		int[][] numbers = new int[rows][cols];

		System.out.println("*************");


		//input
		//rows
		for (int i = 0; i < rows; i++) {
			//columns
			for (int j = 0; j < cols; j++) {
				numbers[i][j] = scanner.nextInt();
			}
		}

		System.out.println();
		System.out.println("%%%%%%%%%%%");

		// output
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("&&&&&&&&&&&&&&&");

		System.out.println();
		System.out.println("Enter the value to search");
		int x = scanner.nextInt();

		System.out.println("#############");

		// giving location of search value
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(numbers[i][j] == x){
					System.out.println("value is at location of (" +i + ","  +j +" )" );
				}
			}
			System.out.println();
		}

	}
}
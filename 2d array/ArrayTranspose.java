package Placement_Course.Array_2d;

import java.util.Scanner;


public class ArrayTranspose {

	// Function to find the transpose of a matrix
	public static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
		int[][] transpose = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = matrix[i][j];
			}
		}
		return transpose;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows:");
		int rows = scanner.nextInt();

		System.out.println("Enter no of columns:");
		int cols = scanner.nextInt();

		int[][] matrix = new int[rows][cols];

		System.out.println("Enter the elements of the matrix:");

		// Input
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		int[][] transpose = transposeMatrix(matrix, rows, cols);

		System.out.println("Transpose of the matrix:");

		// Output
		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}

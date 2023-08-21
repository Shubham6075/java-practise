package Placement_Course.Array;

import java.util.Scanner;

public class array_3 {
	public static void main(String[] args) {

		// taking input from the user for an array

		// it is printing default value in array ( 0 )

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the no :");
		int n = scanner.nextInt();

		int[] numbers = new int[n];

		for(int i=0; i< numbers.length; i++){
			System.out.println(numbers[i]);
		}
	}
}

package Placement_Course.Array;

import java.util.Scanner;

public class array_7_findGiven_No {
	public static void main(String[] args) {

		// taking input from user and printing values

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the no : ");
		int n = scanner.nextInt();

		System.out.println("**********");

		// input
		int[] numbers = new int[n];

		for(int i=0; i< numbers.length; i++){
			numbers[i] = scanner.nextInt();
		}
		System.out.println("%%%%%%%%%%%%");

		System.out.println("Enter the no to find position :");
		int x = scanner.nextInt();

		System.out.println("###########");

		// output
		for(int i=0; i< numbers.length; i++){
			if(numbers[i] == x){
				System.out.println("x found at index :" +i);
			}
		}

	}
}

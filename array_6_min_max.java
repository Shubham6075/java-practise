package Placement_Course.Array;

import java.util.Scanner;

public class array_6_min_max {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value : ");
		int size = sc.nextInt();
		int[] numbers = new int[size];

		System.out.println("&&&&&&&&&&&&&");

		//input
		for(int i=0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}

		System.out.println("^^^^^^^^^^^^^^^^");

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}

		System.out.println("%%%%%%%%%%%%%%%");

		System.out.println("Largest number is : " + max);
		System.out.println("Smallest number is : " + min);

	}
}

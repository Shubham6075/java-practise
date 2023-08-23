package Placement_Course.Array;

import java.util.Scanner;

public class array_5_names {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value :");
		int size = sc.nextInt();
		String[] names = new String[size];

		System.out.println("**************");


		//input
		for(int i=0; i<size; i++) {
			names[i] = sc.next();
		}

		System.out.println("$$$$$$$$$$$$$$$$$$");

		//output
		for(int i=0; i<names.length; i++) {
			System.out.println("name " + (i+1) +" is : " + names[i]);
		}

	}
}

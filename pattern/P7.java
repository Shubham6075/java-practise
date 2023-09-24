package Placement_Course.Pattern;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {

		/*
		 print this no pyramid as inverted pyramid

		 1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1

		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int n = scanner.nextInt();

		for(int i = n; i >=1; i--){
			for(int j = 1; j <=i; j++){
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}

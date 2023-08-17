package Placement_Course.Alphabet;

import java.util.Scanner;

public class W {
	public static void main(String[] args){

		/*
		print this pattern

		*     *
        *     *
        *     *
        *  *  *
        * * * *
        **   **
        *     *

		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows :");
		int n = scanner.nextInt();

		System.out.println("Enter no of columns :");
		int m = scanner.nextInt();

		System.out.println();

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if( j == 0 || j == m-1 || i+j == n-1 && i > n/2-1 || i == j && i > n/2-1 ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

package Placement_Course.Alphabet;

import java.util.Scanner;

public class R {
	public static void main(String[] args){

		/*
		print this pattern

        *******
        *     *
        *     *
        *******
        *   *
        *    *
        *     *

		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows :");
		int n = scanner.nextInt();

		System.out.println("Enter no of columns");
		int m = scanner.nextInt();

		System.out.println();

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if( i == 0 || j == 0 || i == n/2 || j == m-1 && i < n/2 || i > n/2 && i == j){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

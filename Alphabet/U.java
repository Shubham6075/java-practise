package Placement_Course.Alphabet;

import java.util.Scanner;

public class U {
	public static void main(String[] args){

		/*
		print this pattern

        *     *
        *     *
        *     *
        *     *
        *     *
        *     *
        *******

		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows :");
		int n = scanner.nextInt();

		System.out.println("Enter no of columns :");
		int m = scanner.nextInt();

		System.out.println();

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if( i == n-1 || j == 0 || j == m-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

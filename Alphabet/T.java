package Placement_Course.Alphabet;

import java.util.Scanner;

public class T {
	public static void main(String[] args){

		/*
		print this pattern

        *******
           *
           *
           *
           *
           *
           *

Process finished with exit code 0


		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows :");
		int n = scanner.nextInt();

		System.out.println("Enter no of columns :");
		int m = scanner.nextInt();

		System.out.println();

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if( i == 0 || j == m/2){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

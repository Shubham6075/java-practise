package Placement_Course.Alphabet;

import java.util.Scanner;

public class A {
	public static void main(String[] args){

		/*
		printing alphabet A

		*******
        *     *
        *     *
        *******
        *     *
        *     *
        *     *

		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value of rows :");
		int n = scanner.nextInt();

		System.out.println("Enter value of columns :");
		int m = scanner.nextInt();

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(i == 0 || j == 0 || i == n/2 || j == m-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

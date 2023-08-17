package Placement_Course.Alphabet;

import java.util.Scanner;

public class G {
	public static void main(String[] arg){

		/*
		print this pattern

		*******
        *     *
        *
        *
        *   ***
        *     *
        *******

		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int n = scanner.nextInt();

		System.out.println("Enter no of columns");
		int m = scanner.nextInt();

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(i == 0 || j == 0 || i == n-1 || j == m-1 && i < n/2-1
						 || i == n-3 && j > m-4 || j == m-1 && i > n-3){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

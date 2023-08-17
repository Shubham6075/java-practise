package Placement_Course.Alphabet;

import java.util.Scanner;

public class Z {
	public static void main(String[] args){

		/*
		print this pattern : Z

		*******
             *
            *
           *
          *
         *
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
				if(i == 0 || i == n-1 || i+j == n-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

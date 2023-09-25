package Placement_Course.Pattern1;

import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {

		/*
		 print this pattern : solid rhombus ( similar to {P5 in Pattern package} space loop
		                                      of pyramid space for this rhombus pattern )

		     *****
            *****
           *****
          *****
         *****

		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scanner.nextInt();

		for(int i=1; i<=n; i++){
			// spaces
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			// stars
			for(int j=1; j<=n; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

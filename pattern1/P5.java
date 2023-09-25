package Placement_Course.Pattern1;

import java.util.Scanner;

public class P5 {
	public static void main(String[] args) {

		/*
		   print this pattern : diamond(space loop similar to P2, P3, P4 in same package)
		       *
              ***
             *****
            *******
           *********
           *********
            *******
             *****
              ***
               *

		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = scanner.nextInt();

		//upper part
		for(int i=1; i<=n; i++) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			// stars
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}


		//lower part
		for(int i=n; i>=1; i--) {
			//spaces
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			// stars
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

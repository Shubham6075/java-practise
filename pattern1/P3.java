package Placement_Course.Pattern1;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {

		/*

		print this pattern : hollow rhombus (similar to P2)

		      *******
             *     *
            *     *
           *     *
          *     *
         *     *
        *******

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
				if(i== 1 || j==1 || i==n || j==n) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

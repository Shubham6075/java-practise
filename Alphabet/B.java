package Placement_Course.Alphabet;

import java.util.Scanner;

public class B {
	public static void main(String[] args){

		/*

		 print this pattern

		 *******
         *     *
         *     *
         *******
         *     *
         *     *
         *******
		 */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter row no");
		int n = scanner.nextInt();

		System.out.println("Enter column no");
		int m = scanner.nextInt();

		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(i == 0 || j == 0 || i == n/2 || i == n-1 || j == m-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}

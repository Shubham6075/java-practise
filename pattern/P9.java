package Placement_Course.Pattern;

import java.util.Scanner;

public class P9 {
	public static void main(String[] args) {

		/*
		print this pattern : 0-1 triangle

        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1

		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter no of rows");
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
              int sum = i+j;
			  if(sum % 2 == 0){
				  System.out.print("1" +" ");
			  }else{
				  System.out.print("0" +" ");
			  }
			}
			System.out.println();
		}
	}
}
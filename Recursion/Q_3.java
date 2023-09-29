package Placement_Course.Recursion;

import java.util.Scanner;

public class Q_3 {

	//print sum of n natural numbers

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value of n :");
		int n = scanner.nextInt();

		System.out.println(" Sum : " +Sum(n));
	}

	public static int Sum(int n){
		if(n == 0){
			return 0;
		}
		return n+Sum(n-1);

	}
}

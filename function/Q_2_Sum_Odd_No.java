package Placement_Course.Function_Method.Question;

import java.util.Scanner;

public class Q_2_Sum_Odd_No {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the no :");
		int n = scanner.nextInt();

		System.out.println("Sum of no's : " +sum(n));
	}

	public static int sum(int n){
		int sum = 0;
		for(int i=0; i<=n; i++){
			if(i % 2 != 0){
				sum = sum+i;
			}
		}
		return sum;
	}
}

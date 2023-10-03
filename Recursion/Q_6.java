package Placement_Course.Recursion;

import java.util.Scanner;

public class Q_6 {

	// print power of number
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value of no :");
		int x = scanner.nextInt();

		System.out.println("Enter value of power");
		int n = scanner.nextInt();

		int output = printPower(x,n);
		System.out.println( x + " Power " + n + " : " +output);

	}

	public static int printPower(int x, int n){
		if(n == 0){
			return 1;
		}
		if(x == 0 ){
			return 0;
		}

		int x_ = printPower(x,n-1);
		int xn;
		xn = x * x_;
		return xn;

	}
}

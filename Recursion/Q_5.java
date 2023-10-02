package Placement_Course.Recursion;

public class Q_5 {

	// print fibonacci series

	public static void main(String[] args) {

		// these 2 condition give u nth no of fibonacci series

		System.out.println(fibo(4));
		System.out.println(fibo(6));

		System.out.println();

		// it will help u to print fibonacci series

		int n = 5;

		System.out.println("Fibonacci series of given numbers :");
		for(int i=0;i<n;i++){
			System.out.print(fibo(i) + " ");
		}

	}
	static int fibo(int n){
		// base condition
		if(n<2){
			return n;
		}

		return fibo(n-1 ) + fibo(n-2);

	}
}

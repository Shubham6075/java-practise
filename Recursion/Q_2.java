package Placement_Course.Recursion;

public class Q_2 {

	// print no from 1 to n

	public static void main(String[] args){

		 printNumb(1);

	}

	public static void printNumb(int n){

		if(n == 6){
			return ;
		}

		System.out.println(n);

		printNumb(n+1);

	}
}

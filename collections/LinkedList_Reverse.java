package Placement_Course.Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Reverse {
	public static void main(String[] args){

		LinkedList<Integer> list = new LinkedList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);

		System.out.println("^^^^^^^^^^^^");

		// to reverse a list : use Collections.reverse() function
		Collections.reverse(list);
		System.out.println(list);

	}
}

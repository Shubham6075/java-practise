package Placement_Course.Collections;

import java.util.LinkedList;

public class LinkedList_ {
	public static void main(String[] args){

		LinkedList<String> list = new LinkedList<>();

		// adding element : use add() function
		list.add("is");
		list.add("a");                   // by default add() function will add value at last index

		// adding last : use addLast() function
		list.addLast("list");

		// adding first : use addFirst() function
		list.addFirst("this");

		// adding at a position
		list.add(3,"linked");

		System.out.println(list);

		System.out.println("^^^^^^^^^^^^");

		// getting element at specific pos : use get() function
		System.out.println(list.get(0));

		System.out.println("^^^^^^^^^^^");

		// getting size of list
		System.out.println(list.size());

		System.out.println("^^^^^^^^^^^^");

		// deleting element : use remove() function
		list.remove(3);
		System.out.println(list);

		System.out.println("^^^^^^^^^^^^");

		// deleting first : use removeFirst() function
		list.removeFirst();
		System.out.println(list);

		System.out.println("^^^^^^^^^^^^^^^^^");

		// deleting last : use removeLast() function
		list.removeLast();
		System.out.println(list);

		System.out.println("^^^^^^^^^^^^^^");

		// getting index of value : use indexOf() function
		System.out.println(list.indexOf("a"));




	}
}

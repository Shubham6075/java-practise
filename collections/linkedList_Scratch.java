package Placement_Course.Collections;

 class linkedList_Scratch {

	 private linkedList_Scratch.Node Node;

	 public static void main(String[] args) {
		 linkedList_Scratch list = new linkedList_Scratch();
		 list.addLast("is");
		 list.addLast("a");
		 list.addLast("list");
		 list.printList();


		 list.addFirst("this");
		 list.printList();
		 System.out.println(list.getSize());


		 list.removeFirst();
		 list.printList();


		 list.removeLast();
		 list.printList();

		 System.out.println("^^^^^^^^^^^^");

		 linkedList_Scratch list1 = new linkedList_Scratch();

		 list1.addLast("1");
		 list1.addLast("2");
		 list1.addLast("3");
		 list1.addLast("4");

		 list1.printList();

		 System.out.println("^^^^^^^^^^^^^^^");


		 list1.reverseList();
		 list1.printList();

		 System.out.println("^^^^^^^^^^^^^^");

		 list1.reverseListRecursive(list.Node);
		 list1.printList();

	 }


	 Node head;
	 private int size;

	 linkedList_Scratch () {

		 size = 0;
	 }

	 public class Node {
		 String data;
		 Node next;

		 Node(String data) {
			 this.data = data;
			 this.next = null;
			 size++;
		 }
	 }

	 // add-first
	 public void addFirst(String data) {
		 Node newNode = new Node(data);
		 newNode.next = head;
		 head = newNode;
	 }

	 // add-last
	 public void addLast(String data) {
		 Node newNode = new Node(data);

		 if(head == null) {
			 head = newNode;
			 return;
		 }

		 Node lastNode = head;
		 while(lastNode.next != null) {
			 lastNode = lastNode.next;
		 }

		 lastNode.next = newNode;
	 }

	 // print-list
	 public void printList() {
		 Node currNode = head;

		 while(currNode != null) {
			 System.out.print(currNode.data+" -> ");
			 currNode = currNode.next;
		 }

		 System.out.println("null");
	 }

	 // delete first
	 public void removeFirst() {
		 if(head == null) {
			 System.out.println("Empty List, nothing to delete");
			 return;
		 }

		 head = this.head.next;
		 size--;
	 }

	 // delete last
	 public void removeLast() {
		 if(head == null) {
			 System.out.println("Empty List, nothing to delete");
			 return;
		 }

		 size--;
		 if(head.next == null) {
			 head = null;
			 return;
		 }

		 Node currNode = head;
		 Node lastNode = head.next;
		 while(lastNode.next != null) {
			 currNode = currNode.next;
			 lastNode = lastNode.next;
		 }

		 currNode.next = null;
	 }

	 // list size
	 public int getSize() {
		 return size;
	 }

	 // reverse a linked list using iteration
	 public void reverseList() {
		 if(head == null || head.next == null) {
			 return;
		 }


		 Node prevNode = head;
		 Node currNode = head.next;
		 while(currNode != null) {
			 Node nextNode = currNode.next;
			 currNode.next = prevNode;
			 prevNode = currNode;
			 currNode = nextNode;
		 }
		 head.next = null;
		 head = prevNode;
	 }

	 // using recursion
	 public Node reverseListRecursive(Node head) {
		 //empty node || last node or only one node
		 if(head == null || head.next == null) {
			 return head;
		 }


		 Node newHead = reverseListRecursive(head.next);

		 head.next.next = head;
		 head.next = null;
		 return newHead;
	 }



 }

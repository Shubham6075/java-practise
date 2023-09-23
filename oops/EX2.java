package Placement_Course.OOPs;

class Pen{
	String color;

	public void printColor(){
		System.out.println("the color of pen is :" +this.color);
	}
}

public class EX2 {
	public static void main(String[] args){

		Pen p1 = new Pen();
		p1.color = "blue";

		Pen p2 = new Pen();
		p2.color = "red";

		Pen p3 = new Pen();
		p3.color = "black";

		p1.printColor();
		p2.printColor();
		p3.printColor();
	}
}

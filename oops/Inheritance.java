package Placement_Course.OOPs;

class Shape{

	public void get(String type){
		System.out.println("shape : " +type);
	}

	public void area(){

	}

	public void perimeter(){

	}
}

class Triangle extends Shape{

	public void area(int h,int b){
		int area =  b * h;
		System.out.println(area);

	}

	public void perimeter(int h, int b){
		System.out.println(2*b+h);
	}
}

class Circle extends Shape{

	public void area(int r){
		System.out.println((3.14)*r*r);
	}

	public void perimeter(int r){
		System.out.println(2* 3.14 *r);
	}
}
public class Inheritance {

	public static void main(String[] args){

		// object of Shape
		Shape s = new Shape();
		s.get("types");
		s.area();
		s.perimeter();

		// object of Triangle
		Triangle t = new Triangle();
		s.get("Triangular") ;

		t.area(6,10);
		t.perimeter(6,10);

		// object of Circle
		Circle c = new Circle();
		s.get("Circular");
		c.area(7);
		c.perimeter(14);



	}
}

package com.tnif.abstyract;

public class Square extends Shape {
private float side;
public Square() {
	side = 2.0f;
}
public Square(float side) {
	this.side=side;
}
@Override
void calarea() {
	// TODO Auto-generated method stub
	super.area=side*side;
	
}
@Override
public String toString() {
	return "Square [side=" + side + "]";
}
	public static void main(String[] args) {
		Shape p=new Square(4.0f);
		System.out.println(p);
		p.calarea();
		p.show();
	}

}

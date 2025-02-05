package com.tnif.polymorphime;

public class Bicycle extends Vehicle {
	@Override
	void move() {
		System.out.println("Bycle pedals");
	}
	
	public static void main(String[] args) {
		Bicycle c=new Bicycle();
		c.move();
	}
}

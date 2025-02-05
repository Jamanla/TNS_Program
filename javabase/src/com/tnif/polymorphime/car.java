package com.tnif.polymorphime;

public class car extends Vehicle {
	
	@Override
	void move() {
	
			System.out.println("car drives");
		}
		
		void display() {
			super.move();
			move();
		}
		
		public static void main(String[] args) {
			car c=new car();
			//c.move();
			
			c.display();
		}
	}

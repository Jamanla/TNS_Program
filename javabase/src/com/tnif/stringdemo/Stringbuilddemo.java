package com.tnif.stringdemo;

public class Stringbuilddemo {
	public static void main(String[] args) {
		StringBuilder r= new StringBuilder("Welcome");
		r.append("tojava");
		System.out.println(r);
		
		r.insert(2,"hi");
		System.out.println(r);
		r.delete(2, 5);
		System.out.println(r);
		r.reverse();
		System.out.println(r);
	}
	

}

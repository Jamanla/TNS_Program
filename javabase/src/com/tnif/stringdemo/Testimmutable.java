package com.tnif.stringdemo;

public class Testimmutable {
	public static void main(String[] args) {
		String s="Shiva";
		s.concat("Suresh");
		System.out.println(s);
		s=s.concat("Suresh");
		System.out.println(s);
		
	}

}

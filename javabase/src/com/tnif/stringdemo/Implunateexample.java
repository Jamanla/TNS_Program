package com.tnif.stringdemo;

public class Implunateexample {
	public static void main(String[] args) {
		String s1= "rama";
		String s2=s1;
		String s3=s2;
		System.out.println("before modefier");
		System.out.println("s1"+s2);
		System.out.println("s2"+s3);
		System.out.println("s3"+s1);
		
		s1="radha";
		System.out.println("after modefier");
		System.out.println("s1"+s2);
		System.out.println("s2"+s3);
		System.out.println("s3"+s1);
		
	}

}

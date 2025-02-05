package com.tnif.polymorphime;

public class Methodoverloading {
	int add (int a,int b) {
	     return a+b;
	}

    int add (int a,int b,int c) {
         return a+b+c;
          }
 public static void main (String[] args) {
	 Methodoverloading m= new Methodoverloading();
	 System.err.println(m.add(3, 6));
	 System.out.println(m.add(4, 6, 9));
 }
}

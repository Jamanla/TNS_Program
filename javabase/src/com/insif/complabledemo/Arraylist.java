package com.insif.complabledemo;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer>a =new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(4);
		a.forEach(List->System.out.println(List));
	}
}

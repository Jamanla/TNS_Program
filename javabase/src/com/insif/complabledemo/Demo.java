package com.insif.complabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Laptop> laps=new ArrayList<Laptop>();		
		laps.add (new Laptop("dell",7000,9));
		laps.add (new Laptop("lenvo",6000,12));
		laps.add (new Laptop("hp",2000,5));

		Collections.sort(laps);
		for(Laptop l:laps);{
	 System.out.println(l);
		}
	
	}
}

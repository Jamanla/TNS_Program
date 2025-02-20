package com.insif.complabledemo;
import java.util.Stack;

public class Stackclass {
	public static void main(String[] args) {
		Stack<Integer>ob=new Stack <Integer>();
		ob.push(123);
		ob.push(341);
		ob.push(345);
		ob.push(340);
		System.out.println("Stack Element"+ob);
		//peek
		System.out.println(ob.peek());
		if(ob.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("stack is not empty");
			
		}
		System.out.println(ob.search(123));
		System.out.println(ob.search(768));
		
	}

}

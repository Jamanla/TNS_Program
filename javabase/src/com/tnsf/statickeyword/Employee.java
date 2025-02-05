package com.tnsf.statickeyword;

public class Employee {
	int eid;
	String name;
	static String Companyname="tcs";
	Employee(int r,String n){
		eid=r;
		name=n;
	}
void diplay() {
	System.out.println(eid+""+name+""+Companyname);
}
public static void main(String[] args) {
	Employee e1=new Employee(1,"thaanush");
	Employee e2=new Employee(2,"anush");
	Employee e3=new Employee(3,"raja");
	e1.diplay();
	e2.diplay();
	e3.diplay();
}
}

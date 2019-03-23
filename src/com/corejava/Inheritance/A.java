package com.corejava.Inheritance;

class B 
{
	int a=10;
}
public class A extends B
{
	int a=20;

	public static void main(String[] args) 
	{
		B y=new B();
		System.out.println(y.a);
	}
}

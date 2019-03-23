package com.corejava.Object;

public class Example 
{
	int a=11;
	public static void main(String[] args) 
	{
		System.out.println("hello");
		m();
		System.out.println("hii");
	}
	public static void m()
	{
		Example e=new Example();
		System.out.println("creating object outside main method");
		System.out.println(e.a);
	}
}

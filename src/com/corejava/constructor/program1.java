package com.corejava.constructor;

public class program1 
{
	int id;
	program1(int a)
	{
		id=a;
	}
	public static void main(String[] args) 
	{
		System.out.println("main started");
		program1 p=new program1(10);
		System.out.println(p.id);
		program1 p1=new program1(20);
		System.out.println(p1.id);
	}
}

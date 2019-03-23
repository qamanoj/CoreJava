package com.corejava.Blocks;

public class Test
{
	static int c;
	static
	{
	int a=19;
	int b=20;
	c=a+b;
	}
	public static void main(String[] args) 
	{
		System.out.println("main started");
		System.out.println(Test.c);
	}
}

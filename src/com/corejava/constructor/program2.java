package com.corejava.constructor;

public class program2
{
	void program2() 
	{
		System.out.println("i am not constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("main started");
		program2 p=new program2();
		p.program2();
	}
}

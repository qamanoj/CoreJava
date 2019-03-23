package com.corejava.ExceptionHandling;

public class finallyblock
{
 public static void main(String[] args) 
 {
	System.out.println("main started");
	try
	{
		System.out.println("try started");
		int a=1/0;
		System.out.println("try ended");
	}
	catch(Exception e)
	{
		System.out.println("catch block");
	}
	finally
	{
		System.out.println("i am finally block");
	}
}
}

package com.corejava.ExceptionHandling;

public class nestedtrycatch 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		try
		{
			System.out.println("try started");
			try
			{
				int a=1/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			System.out.println("try ended");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("main ended");
	}	
}

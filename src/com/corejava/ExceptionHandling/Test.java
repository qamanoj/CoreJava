package com.corejava.ExceptionHandling;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		try
		{
			System.out.println("try started");
			int a=1/0;
			System.out.println("hello");
		}
		catch(Exception e)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String s=sc.next();
			System.out.println("enter the index no");
			int index=sc.nextInt();
			try
			{
				System.out.println(s.charAt(index));
			}
			catch(Exception ee)
			{
				System.out.println("catch block");
			}
		}
		System.out.println("main ended");
	}
}

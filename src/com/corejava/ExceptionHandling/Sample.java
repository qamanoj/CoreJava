package com.corejava.ExceptionHandling;

import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the numarator");
			int num=sc.nextInt();
			System.out.println("enter the den");
			int den=sc.nextInt();
			int div=num/den;	
			System.out.println("enter the string");
			String s=sc.next();
			System.out.println(s.charAt(div));
			Sample sa=(Sample)new Object();
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("catch block");
			
		}
		catch(ArithmeticException ar)
		{
			System.out.println("catch block1");
			
		}
		catch(RuntimeException r)
		{
			System.out.println("catch block2");
			
		}
		System.out.println("main ended");
	}
}

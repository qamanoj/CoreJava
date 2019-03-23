package com.corejava.ExceptionHandling;

import java.util.Scanner;

public class finallyblock1 
{
  public static void main(String[] args) 
  {
	System.out.println("main started");
	try
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		System.out.println("enter the indexno");
		int index=sc.nextInt();
		System.out.println(s.charAt(index));		
	}
	catch(Exception e)
	{
		System.out.println("catch block");
		e.printStackTrace();
	}
	finally
	{
		System.out.println("i am finally block");
	}
	System.out.println("main ended");
}
}

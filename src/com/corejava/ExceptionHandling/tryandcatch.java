package com.corejava.ExceptionHandling;

public class tryandcatch
{
	public static void main(String[] args) 
	{
		/*System.out.println("main started");   
		int a=1/0;
        System.out.println("main ended");*/
		System.out.println("main started");
		try
		{
			System.out.println("try started");
			int a=1/0;//abnormal statement or risky statement
			System.out.println("try ended");
		}
		catch(Exception e)
		{
			System.out.println("catch block");
		}
          System.out.println("main ended");
	}
}

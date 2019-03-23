package com.corejava.ExceptionHandling;

public class nullpointerException 
{
  int a=10;
  public static void main(String[] args) 
  {
	try
	{
		nullpointerException n=null;
		System.out.println(n.a);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

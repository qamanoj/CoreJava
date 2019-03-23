package com.corejava.classforneme;

public class sample 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		try
		{
			Class.forName("class");//try sample1=2,to get message erroe
		}
		catch(Exception e)
		{
			System.out.println("catch block");
			System.out.println(e);
		}
		System.out.println("main ended");
	}
}

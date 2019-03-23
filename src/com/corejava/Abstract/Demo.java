package com.corejava.Abstract;

abstract class Demo1 
{
	Demo1()
	{
		System.out.println("this is constructor");
	}
}
public class Demo extends Demo1
{
	Demo()
	{
		//super();
		System.out.println("this is sub class constructor");
	}
	public static void main(String[] args) 
	{
		Demo d=new Demo();
	}
}

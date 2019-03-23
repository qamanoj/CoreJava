package com.corejava.Inheritance;

public class basicphone 
{
	void test()
	{
		System.out.println("hello");
	}
	void test1()
	{
		System.out.println("hii");
	}
	
}
class cameraphone extends basicphone
{
	void call()
	{
		System.out.println("bye");
	}
}
class smartphone extends cameraphone
{
	void take()
	{
		System.out.println("good");
	}
}
 




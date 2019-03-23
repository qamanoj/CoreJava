package com.corejava.Inheritance;

public class Person 
{
	public static void main(String[] args) 
	{
		smartphone s=new smartphone();
		s.test();
		s.test1();
		s.call();
		s.take();
		System.out.println("********");
		cameraphone c=new cameraphone();
		c.test();
		c.test1();
		c.call();
		System.out.println("*********");
		basicphone b=new basicphone();
		b.test();
		b.test1();
	}
}

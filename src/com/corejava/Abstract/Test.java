package com.corejava.Abstract;

abstract class Test1
{
	abstract void m();
	abstract void m1();
}
public class Test extends Test1
{
	void m()
	{
		System.out.println("this is m method");
	}
	void m1()
	{
		System.out.println("this is m1 method");
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.m();
		t.m1();
	}
}
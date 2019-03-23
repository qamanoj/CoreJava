package com.corejava.Abstract;

abstract class A
{
	abstract void m();
	abstract void m1();
}
class B extends A
{
	void m()
	{
		System.out.println("this is m method for B class");
	}
	void m1()
	{
		System.out.println("this is m1 method for B class");}
}
class C extends A
{
	void m()
	{
		System.out.println("this is m method for c class");
	}
	void m1()
	{
		System.out.println("this is m1 method for c class");
	}
}

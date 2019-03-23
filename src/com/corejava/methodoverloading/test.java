package com.corejava.methodoverloading;

public class test 
{
	void add(int a,float b)
	{	
		float c=a+b;
		System.out.println(c);
	}
	void add(float a,int b)
	{
		float d=a+b;
		System.out.println(d);
	}
	public static void main(String[] args) 
	{	
		test t=new test();
		t.add(10,10.1f);
		t.add(10.1f,20);
	}
}

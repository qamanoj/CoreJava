package com.corejava.methodoverloading;

//type of the parameter different

public class sample 
{
	
	void test(int a)
	{
		System.out.println(a);
	}
	void test(float b)
	{
		System.out.println(b);
		
	}
	
	public static void main(String[] args) 
	{
		sample s=new sample();
		s.test(10);
		s.test(20.1f);
	}
	
}

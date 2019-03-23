package com.corejava.Object;

public class sample 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		sample s=new sample();
		s.test();
		System.out.println("main ended");
	}
	void test()
	{
		System.out.println("non ststic method");
	}

}

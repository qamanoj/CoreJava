package com.corejava.Abstract;

abstract class Sample1 
{
	void m()
	{
		System.out.println("super class method");
	}	
}
 public class Sample extends Sample1
{
	 void m1()
		{
			System.out.println("sub class method");
		}		 
		public static void main(String[] args)
		{
			Sample s =new Sample();
			s.m();
			s.m1();
		}
	}




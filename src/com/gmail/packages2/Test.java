package com.gmail.packages2;

public class Test 
{
	public static void main(String[] args) 
	{
		com.gmail.packages1.Sample s=new com.gmail.packages1.Sample();
		System.out.println(s.a);
		s.test();
		System.out.println("**********");
		System.out.println(com.gmail.packages1.Sample.b);
		com.gmail.packages1.Sample.test1();
	}
}

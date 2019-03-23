package com.gmail.packages2;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		System.out.println(d.m);
		d.test2();
		System.out.println(Demo.n);
		Demo.test3();
		System.out.println("*********");
		com.gmail.packages1.Demo d1=new com.gmail.packages1.Demo();
		System.out.println(d1.a);
		d1.test();
		System.out.println(com.gmail.packages1.Demo.b);
		com.gmail.packages1.Demo.test1();
	}
}

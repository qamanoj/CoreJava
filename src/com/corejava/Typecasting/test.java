package com.corejava.Typecasting;

public class test 
{
	 public static void main(String[] args)
	 {
		Up u=new A();
		u.test();
		
		A a=(A)u;
		a.test1();
		a.test();
	}
}


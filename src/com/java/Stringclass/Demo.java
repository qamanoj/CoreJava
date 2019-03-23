package com.java.Stringclass;

public class Demo {

	public static void main(String[] args)
	{
		String s1=new String("spring");
		s1.concat("fall");
		System.out.println(s1);
		s1=s1+"winter";
		String s2=s1.concat("summer");
		System.out.println(s1);
		System.out.println(s2);
	}
}

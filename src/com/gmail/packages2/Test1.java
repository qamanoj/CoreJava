package com.gmail.packages2;
import com.gmail.packages1.*;

public class Test1
{
	public static void main(String[] args) 
	{
		Sample1 s=new Sample1();
		System.out.println(s.a);
		s.test();
		System.out.println(Sample1.b);
		Sample1.test1();
		System.out.println("***********");
		Sample2 s1=new Sample2();
		System.out.println(s1.a);
		s1.test();
		System.out.println(Sample2.b);
		Sample2.test1();
	}
}

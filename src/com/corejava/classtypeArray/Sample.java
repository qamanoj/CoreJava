package com.corejava.classtypeArray;

public class Sample 
{
	public static void main(String[] args) 
	{
		Sample s[]=new Sample[5];
		for (int i = 0; i <=s.length-1; i++)
		{
			System.out.println(s[i]);
		}
		System.out.println("*********");
		s[0]=new Sample();
		s[1]=new Sample();
		s[2]=new Sample();
		s[3]=new Sample();
		s[4]=new Sample();
		for (int i = 0; i <=s.length-1; i++)
		{
			System.out.println(s[i]);
		}
	}
}

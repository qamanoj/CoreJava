package com.java.Stringclass;

public class Program1 
{
	public static void main(String[] args) 
	{
		String s=new String("manoj");//ncpa

		System.out.println(s);
		System.out.println(s.toString());

		String s1=new String("manoj");
		String s2=new String("kumar");

		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s==s1);

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		//join two String contains

		String s3="manoj1";//cpa
		String s4=new String("kumar1");

		System.out.println(s.concat(s3));
		System.out.println(s3.concat(s4));
        //useing + operater
		
		String s5="core";
		String s6=s5+"java";
		System.out.println(s6);
		System.out.println(s6.concat(" "+"developer"));
		
		System.out.println(s6.toUpperCase());
		System.out.println(s6.toLowerCase());
		
	}
}

package com.comandlinearguments;

public class Porgram1 
{
	public static void main(String[] args) 
	{
		//System.out.println(null); The method println(char[]) is ambiguous for the type PrintStream
		System.out.println(args.length);
		System.out.println("***********");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println((String)null);
	}
}

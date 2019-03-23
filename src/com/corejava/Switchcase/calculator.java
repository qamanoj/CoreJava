package com.corejava.Switchcase;

public class calculator 
{
	public static void main(String[] args) 
	{
		int option=2;
		switch(option)
		{
		case 1:System.out.println("addition operation");
		int c=add(10,20);
		System.out.println("value is"+c);
		break;
		case 2:System.out.println("substraction operation");
		int d=sub(10,20);
		System.out.println("value is"+d);
		break;
		case 3:System.out.println("multiplication operation");
		int e=mul(10,20);
		System.out.println("value is"+e);
		break;
		default :System.out.println("no such operation");
		}
	}
	public static int add(int a,int b)
	{
		System.out.println("a value is"+a);
		System.out.println("b value is"+b);
		return a+b;
	}
	public static int sub(int a,int b)
	{
		System.out.println("a value is"+a);
		System.out.println("b value is"+b);
		return a-b;
	}
	public static int mul(int a,int b)
	{
		System.out.println("a value is"+a);
		System.out.println("b value is"+b);
		return a*b;
	}
}

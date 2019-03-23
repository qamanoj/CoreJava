package com.corejava.WrapperClass;

public class WrapperStep 
{
	public static void main(String[] args) 
	{
		m(10.2);
	}
	public static void m(int a)
	{
		System.out.println("int");
	}
	public static void m(Integer a)
	{
		System.out.println("Integer");
	}
	public static void m(Float a)
	{
		System.out.println("float");
	}
	/*public static void m(Double a)
	{
		System.out.println("double");
	}*/
	public static void m(Object a)
	{
		System.out.println("Object");
	}
	
}

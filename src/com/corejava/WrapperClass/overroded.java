package com.corejava.WrapperClass;

public class overroded 
{
	public static void main(String[] args) 
	{
		Integer it=new Integer(10);
		Integer it1=new Integer(10);
		System.out.println(it.toString());
		System.out.println(it.equals(it1));
		System.out.println(it.hashCode());
		System.out.println(it1.hashCode());
	}
}

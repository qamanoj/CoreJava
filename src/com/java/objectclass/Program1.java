package com.java.objectclass;

public class Program1 
{
	public static void main(String[] args) 
	{
		Object obj=new Object();
		Object obj1=new Object();
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		System.out.println(obj);
		System.out.println(obj1.toString());
		System.out.println(obj==obj1);
		System.out.println(obj==obj);
		System.out.println(obj.equals(obj1));
		System.out.println(obj.equals(obj));
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());	
	}
}

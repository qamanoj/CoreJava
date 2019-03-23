package com.corejava.AccessModifire;

public class sample1 extends sample 
{
	private int a=10;
	String b="abc";
    protected float c=12.5f;
    public char d='A';
	public static void main(String[] args) 
	{
     sample s=new sample();
     //System.out.println(s.a); cte
     System.out.println(s.b);
     System.out.println(s.c);
     System.out.println(s.d);
	}
}

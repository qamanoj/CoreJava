package com.corejava.Blocks;
//first non-static block then constructor
public class demo 
{
	demo()
	{
		System.out.println("constructoer");//constructor
	}
	{
		System.out.println("nonstatic block");//non-static block
	}
	public static void main(String[] args) 
	{
		demo d=new demo();
	}
}

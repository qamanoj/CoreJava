package com.corejava.PassByAddress;

public class employe
{
	int id;
	String name;
	char grade;
	static String collegename="synergy";
	employe(int id,String name,char grade)
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	public static void main(String[] args) 
	{
		employe s=new employe(10,"manoj",'A');
		method(s);
	}
	public static void method(employe x)
	{
		System.out.println(x.id);
		System.out.println(x.name);
		System.out.println(x.grade);
		System.out.println(employe.collegename);
	}
}

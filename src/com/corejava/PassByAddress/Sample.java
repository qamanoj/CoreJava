package com.corejava.PassByAddress;

public class Sample 
{	
	int id;
	String name;
	char grade;
	static String collegename="synergy";
	Sample(int id,String name,char grade)
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	public static void main(String[] args) 
	{
		Sample s=new Sample(1, "manoj", 'A');
		Sample s1=s.test();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.grade);
		System.out.println(Sample.collegename);
	}
	Sample test()
	{
		Sample s=new Sample(1, "manoj", 'A');
		Sample s1=new Sample(10, "kumar", 'B');
		return s1;
	}
}

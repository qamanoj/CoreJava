package com.corejava.constructoroverloading;

public class student 
{
	int id;
	String name;
	char grade;
	student(int id)
	{
		this.id=id;
	}
	student(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	student(int id,String name,char grade)
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	public static void main(String[] args) 
	{
		student s=new student(10);
		student s1=new student(20,"manoj");
		student s2=new student(30,"kumar",'A');
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.grade);
		System.out.println("**********");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.grade);
		System.out.println("**********");
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.grade);
	}
}

package com.corejava.classtypeArray;

public class Student
{
	int id;
	String name;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Student s[]=new Student[4];
		s[0]=new Student(100, "manoj");
		s[1]=new Student(200, "kumar");
		s[2]=new Student(300, "sahoo");
		s[3]=new Student(400, "litu");
		for (int i = 0; i <=s.length-1; i++) 
		{
			System.out.println(s[i].id);
			System.out.println(s[i].name);
			System.out.println("******");
		}
	}
}

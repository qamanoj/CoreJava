package com.java.objectclass;

public class Student1
{
	int id;
	String name;
	Student1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return name+" "+id;
	}
	public static void main(String[] args) 
	{
		Student1 st=new Student1(101,"manoj");
		System.out.println(st);
		System.out.println(st.toString());
		Student1 st1=new Student1(102, "kumar");
		Student1 st2=new Student1(101, "manoj");
		System.out.println(st1);
		System.out.println(st2.toString());
		System.out.println(st.equals(st2));
	}

}

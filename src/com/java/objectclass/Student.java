package com.java.objectclass;

public class Student 
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Student st=new Student(101,"abc");
		Student st1=new Student(102,"xyz");
		System.out.println(st);//implicity tostring calling
		System.out.println(st.toString());//explicity tostring calling
		System.out.println(st.equals(st1));
		System.out.println(st.equals(st));
		System.out.println(st==st);
		System.out.println(st==st1);
		System.out.println(st.hashCode());
		System.out.println(st1.hashCode());
	}
}



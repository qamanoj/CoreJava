package com.corejava.Object;

public class student 
{
	int id;
	String name;
	char grade;
	static String collegename="synergy";
	public static void main(String[] args) 
	{
		student s=new student();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.grade);
		s.login();
		s.logout();
		s.work();
		System.out.println("college name "+student.collegename);
	}
	void login()
	{
		System.out.println("student login");
	}
	void logout()
	{
		System.out.println("student logout");
	}
	void work()
	{
		System.out.println("student work");
	}
}


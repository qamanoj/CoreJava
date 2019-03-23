package com.corejava.Object;
public class employe 
{
	int id;
	String name;
	char grade;
	static String collegename="synergy";
	public static void main(String[] args) 
	{
		employe s=new employe();
		s.id=100;
		s.name="manoj";
		s.grade='A';
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.grade);
		s.login();
		s.logout();
		s.work();
	}
	void login()
	{
		System.out.println("employe login");
	}
	void logout()
	{
		System.out.println("employe logout");
	}
	void work()
	{
		System.out.println("employe work");
	}
}

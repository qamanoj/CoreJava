package com.corejava.constructor;

public class program3 
{
	int id;
	String name;
	char bloodgroup;
	public program3(int id,String name,char bloodgroup) 
	{
		this.id=id;
		this.name=name;
		this.bloodgroup=bloodgroup;
	}
	public static void main(String[] args) 
	{
		program3 p=new program3(1, "manoj", 'A');
		program3 p1=new program3(1, "kumar", 'B');
		program3 p2=new program3(1, "sahoo", 'C');
		p.test();
		System.out.println("********");
		p1.test();
		System.out.println("********");
		p2.test();
	}
	void test()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(bloodgroup);
	}
}

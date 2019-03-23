package com.corejava.Encapsulation;

public class student 
{
	private int id;
	private String name;
	student(int id,String name) 
	{
      this.id=id;
      this.name=name;
	}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public void setid(int newid)
	{
		id=newid;
	}
	public void setname(String newname)
	{
		name=newname;
	}
}


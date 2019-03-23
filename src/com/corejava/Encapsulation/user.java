package com.corejava.Encapsulation;

public class user 
{
 public static void main(String[] args) 
 {
	student s=new student(100, "manoj");
	System.out.println("id is "+s.getid());
	System.out.println("name is "+s.getname());
	s.setid(101);
	s.setname("kumar");
	System.out.println("update id is "+s.getid());
	System.out.println("update id is "+s.getname());
}
}

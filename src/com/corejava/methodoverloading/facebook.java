package com.corejava.methodoverloading;

public class facebook 
{
	void search(String firstname)
	{
		System.out.println("my firstname is "+firstname);
	}
	void search(String firstname,String lastname)
	{
		System.out.println("my lastname is "+firstname+" "+lastname);
	}
	void search(long phone)
	{
		System.out.println("my phone no. is "+phone);
	}
	public static void main(String[] args) 
	{
      facebook f=new facebook();
      f.search("manoj");
      f.search("manoj","kumar");
      f.search(1234567890);     
	}
}

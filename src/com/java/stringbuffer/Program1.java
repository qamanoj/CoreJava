package com.java.stringbuffer;

public class Program1 
{
	public static void main(String[] args)
	{
	  StringBuffer s=new StringBuffer("manoj");
	  StringBuffer s1=new StringBuffer("kumar");
	  
	  System.out.println(s);
	  System.out.println(s.toString());
	  System.out.println(s.equals(s1));
	  
	  StringBuffer s3=new StringBuffer("kumar");
	  
      System.out.println(s1.equals(s3));
      System.out.println(s1.hashCode());
      System.out.println(s3.hashCode());
      //join two contains
      
      System.out.println(s.append(s1));
      System.out.println(s.reverse());
      System.out.println(s1.replace(3,4, "hij"));
	}

}

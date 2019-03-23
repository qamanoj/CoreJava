package com.corejava.WrapperClass;

public class ObjectClassFormToPrim 
{
  public static void main(String[] args) 
  {
	  Object obj=10;
	  Object obj1=20;
	  //System.out.println(obj+obj1);//cte
	  Integer it =(Integer)obj;//downcasting
	  int a=it;//autounboxing
	  Integer it1=(Integer)obj1;//downcasting
	  int b=it1;//autounboxing
	  System.out.println(a+b);
  }
}

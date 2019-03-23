package com.corejava.constructoroverloading;

public class sample 
{
  sample()
  {
	  System.out.println("hello");
  }
  sample(int a,String b)
  {
	  System.out.println("hii");
  }
  public static void main(String[] args) 
  {
	sample s=new sample();
	sample s1=new sample(10,"abc");
}
}

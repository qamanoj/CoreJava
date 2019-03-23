package com.corejava.WrapperClass;

public class UnBoxing 
{
 public static void main(String[] args) 
 {
	Integer it =new Integer(10);//boxing
	int a=it.intValue();//unboxing
	System.out.println(a);
	
	Float f=new Float(12.5f);//boxing
	float b=f.floatValue();//unboxing
	
	Character ch=new Character('A');//boxing
	char c=ch.charValue();//unboxing
}
}

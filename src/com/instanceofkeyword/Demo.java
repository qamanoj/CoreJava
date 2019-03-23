package com.instanceofkeyword;

class Animal 
{

}
class human extends Animal
{
	
}
class Dog extends Animal
{
	
}
class Snake extends Animal
{
}
public class Demo
{
	public static void main(String[] args) 
	{
		Animal a=new human();
		System.out.println(a instanceof Snake);
		System.out.println(a instanceof Dog);
		System.out.println(a instanceof human);
	}	
}

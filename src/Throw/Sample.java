package Throw;

import java.util.Scanner;

public class Sample 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age<0)
		{
			throw new ArithmeticException("age can not be -ve");
		}
		else
		{
			System.out.println("age is "+age);
		}
		System.out.println("main ended");
	}
}

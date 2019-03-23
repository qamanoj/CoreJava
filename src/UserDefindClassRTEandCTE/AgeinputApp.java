package UserDefindClassRTEandCTE;

import java.util.Scanner;

public class AgeinputApp 
{
	public static void main(String[] args) {
		
		System.out.println("main started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age<0)
		{
			try
			{
				throw new MyownException("age can not be -ve");
			}
			catch(MyownException my)
			{
				System.out.println(my);
			}
		}
		else
		{
			System.out.println("age is "+age);
		}
		System.out.println("main ended");
	}
}

package Returntype;

public class program3 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		int d=test(10,20);
		System.out.println("hello");
		System.out.println(d);
	}
	public static int test(int a,int b)
	{
		System.out.println("main ended");
		System.out.println(a);
		System.out.println(b);
		int c=a+b;
		return c;
	}
	}


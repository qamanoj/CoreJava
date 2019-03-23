package Returntype;

public class program2 
{	
	public static void main(String[] args) 
	{
		System.out.println("main started");
		char a=test();
		System.out.println(a);
	}
	public static char test()
	{
		System.out.println("main ended");
		char c='d';
		return c;
	}
}


package Returntype;

public class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("main started");
		int a=test();
		System.out.println(a);
	}
	public static int test()
	{
		System.out.println("main ended");
		return 12;
	}
}

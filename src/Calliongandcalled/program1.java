package Calliongandcalled;

public class program1 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		test();
		System.out.println("hii");
	}
	public static void test()
	{
		System.out.println("hello");
		test1();
		System.out.println("Third");
	}
	public static void test1()
	{
		System.out.println("bye");
		test2();
		System.out.println("second");
	}
	public static void test2()
	{
		System.out.println("first");
	}
}

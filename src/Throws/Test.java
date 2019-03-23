package Throws;

public class Test 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		try
		{
			test();
		}
		catch(ClassNotFoundException a)
		{
			System.out.println("catch block");
		}
		System.out.println("main ended");
	}
	static void test() throws ClassNotFoundException
	{
		System.out.println("test started");
		test1();
	}
	static void test1() throws ClassNotFoundException
	{
		System.out.println("test ended");
	}
}

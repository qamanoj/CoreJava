package Throws;

public class Sample
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
			a.printStackTrace();
		}
		System.out.println("main ended");
	}
	static void test() throws ClassNotFoundException
	{
		System.out.println("test started");
		test1();
	}
	static void test1()
	{
		System.out.println("test ended");
	}
}

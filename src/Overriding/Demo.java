package Overriding;

class Sample 
{
	void test()
	{
		System.out.println("super class");
	}
	void test1()
	{
		System.out.println("super class 1");
	}
}
 class Demo extends Sample
{
	int b=20;
	final void test()
	{
		System.out.println("subclass ");
	}
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.test();
		d.test1();
		System.out.println(d.b);
	}
}

package Interface;

interface  A
{
	void test();	
}
public class Demo implements A
{
	Demo()
	{
		System.out.println("hello");
	}
	public void test()
	{	
		System.out.println("hii");
	}
	public static void main(String[] args) 
	{
		Demo d=new Demo();
	}
}

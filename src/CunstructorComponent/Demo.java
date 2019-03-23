package CunstructorComponent;

class Demo2
{
	Demo2()
	{
		super();
		System.out.println("hello");
	}
}
class Demo1 extends Demo2
{
	public Demo1()
	{
		super();
		System.out.println("hii");
	}
}
public class Demo extends Demo1
{
	public Demo()
	{
		super();
		System.out.println("bye");
	}
	public static void main(String[] args)
	{
		Demo1 e=new Demo();
		
	}
}

package innerclass;

public class Outer 
{
	public void m2()
	{
		System.out.println("outer class method");
	}
	public class Inner 
	{
		public void m1()
		{
			System.out.println("inner class method");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("hello");
		Outer o=new Outer();
		o.m2();
		Outer.Inner i=o.new Inner();
		i.m1();
	}
}

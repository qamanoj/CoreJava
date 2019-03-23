package finalKeyword;

public class A 
{
	final int x;
	A(int x)
	{
		this.x=x;
	}
	public static void main(String[] args)
	{
		A a=new A(10);
		System.out.println(a.x);
		A a1=new A(20);
		System.out.println(a1.x);
	}
}

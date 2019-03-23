package finalKeyword;

public class B 
{
	final int x;
	final int y;
	{
		x=10;
		y=20;
	}
public static void main(String[] args)
{
	B b=new B();
	System.out.println(b.x);
	System.out.println(b.y);
}
}

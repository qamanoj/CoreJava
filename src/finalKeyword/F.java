package finalKeyword;

class Sample
{
	final void m()
	{
		System.out.println("hello");
	}
}
public class F extends Sample
{
	void m1()
	{
		System.out.println("hii");
	}
	
	public static void main(String[] args) 
	{
		F f=new F();
		f.m();
		f.m1();
	}
}

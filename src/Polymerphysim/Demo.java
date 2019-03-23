package Polymerphysim;

public class Demo 
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	void add(float a,float b)
	{
		float e=a+b;
		System.out.println(e);
	}
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.add(10, 20);
		Demo d1=new Demo();
		d1.add(10, 20,30);
		Demo d3=new Demo();
		d3.add(10.1f, 20.2f);
	}
}

package Returntype;

public class program4 
{
	public static void main(String[] args)
	{
		float ans=add(10,13.5f);
		System.out.println(ans);
		float ans1=add(20,15.5f);
		System.out.println(ans1);
	}
	public static float add(int a,float b)
	{
		System.out.println(a);
		System.out.println(b);
		float c=a+b;
		return c;
	}
}

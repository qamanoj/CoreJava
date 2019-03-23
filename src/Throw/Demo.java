package Throw;

public class Demo 
{
	public static void main(String[] args)
	{
		System.out.println("main started");
		int no=-5;
		if(no>0)
		{
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("no is "+no);
		}
		System.out.println("main ended");
	}
}

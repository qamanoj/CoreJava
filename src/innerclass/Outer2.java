package innerclass;

public class Outer2 
{
	int x=10;
	class Inner
	{
		int x=100;
		public void m1()
		{
			int x=1000;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer2.this.x);
		}
	}
	public static void main(String[] args)
	{
		new Outer2().new Inner().m1();
	}
}

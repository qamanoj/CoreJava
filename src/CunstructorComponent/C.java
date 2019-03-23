package CunstructorComponent;

 class A
{
	int a=10;
}
class B extends A
{
	int a=20;
}
public class C extends B
{
	int a=30;

	public static void main(String[] args)
	{
		B c=new C();
		System.out.println(c.a);
		B b=new B();
		System.out.println(b.a);
		A a=new B();
		System.out.println(a.a);
	}
}

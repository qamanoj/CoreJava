package Interface;

interface  Sample 
{
    void m();
	void m1();
}
class B implements Sample
{
	public void m()
	{
		System.out.println("this is m method for B class");
	}
	public void m1()
	{
		System.out.println("this is m1 method for B class");}
}
class C implements Sample
{
	public void m()
	{
		System.out.println("this is m method for c class");
	}
	public void m1()
	{
		System.out.println("this is m1 method for c class");
	}
	
}

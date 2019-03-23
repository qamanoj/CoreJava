package CunstructorComponent;

public class sample 
{
	sample(int a) 
	{
		this();
		System.out.println(a);
	}
	sample()
	{
		//super();
		System.out.println("hello");
	}
	public static void main(String[] args) 
	{
		sample s=new sample(10);
	}
}

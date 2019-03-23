package ObjectClassArray;

public class Demo
{
	public static void main(String[] args) 
	{
		Object obj[]=new Object[5];
		for (int i = 0; i <=obj.length-1; i++)
		{
			System.out.println(obj[i]);
		}
		obj[0]=new Demo();
		obj[1]=new Demo();
		obj[2]=new Demo();
		obj[3]=new Sample();
		obj[4]=new Sample();
		for (int i = 0; i <=obj.length-1; i++)
		{
			System.out.println(obj[i]);
		}
	}
}

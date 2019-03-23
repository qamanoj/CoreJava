package ObjectClassArray;

public class IntegerAdd 
{
	public static void main(String[] args)
	{
		Object obj[]=new Object[7];
		obj[0]=12;
		obj[1]='A';
		obj[2]=12.3f;
		obj[3]=1234.567456;
		obj[4]=13;
		obj[5]="abcd";
		obj[6]=15;
		int sum=0;
		for (int i = 0; i <=obj.length-1; i++)
		{
			if(obj[i] instanceof Integer)
			{
				System.out.println(obj[i]);
				Integer it=(Integer)obj[i];
				int a=it;
				sum=sum+a;
			}
		}
		System.out.println("sum is "+sum);
	}
}

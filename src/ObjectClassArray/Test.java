package ObjectClassArray;

public class Test 
{
	public static void main(String[] args) 
	{
		Object obj[]=new Object[6];
		obj[0]=12;
		obj[1]='A';
		obj[2]=12.3f;
		obj[3]=1234567;
		obj[4]=12.2;
		obj[5]="abcd";
		for (int i = 0; i <=obj.length-1; i++)
		{
			System.out.println(obj[i]);
		}
	}
}

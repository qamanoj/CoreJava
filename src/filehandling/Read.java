package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read 
{
	public static void main(String[] args)  
	{
		try
		{
			FileInputStream f=new FileInputStream("C:\\Users\\user\\Desktop\\manoj.txt");
			int i=0;
			while((i=f.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

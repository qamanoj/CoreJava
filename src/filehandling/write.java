package filehandling;

import java.io.FileOutputStream;

import Polymerphysim.User;

public class write 
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream f=new FileOutputStream("C:\\Users\\user\\Desktop\\manoj.txt");
		String s="Manoj is a good boy";
		byte array[]=s.getBytes();
		f.write(array);
	}

}

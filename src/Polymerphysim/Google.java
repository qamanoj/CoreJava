package Polymerphysim;

public class Google 
{
	void search(String input)
	{
		System.out.println("display info about "+input);
	}
}
class News extends Google
{
	void search(String input)
	{
		System.out.println("display the news of "+input);
	}
}
class Images extends Google
{
	void search(String input)
	{
		System.out.println("display the image of "+input);
	}
}
class Maps  extends Google
{
	void search(String input)
	{
		System.out.println("display the location of "+input);
	}
}
class Browser
{
	void Browsing(Google ref,String input)
	{
		ref.search(input);
	}
}
 
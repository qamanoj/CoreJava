package Polymerphysim;

public class User 
{
	public static void main(String[] args) 
	{
		Browser b= new Browser();
		Images i=new Images();
		b.Browsing(i, "Qspiders");
		System.out.println("***********");
		News n=new News();
		b.Browsing(n,"Qspiders");
		System.out.println("**********");
		Maps m=new Maps();
		b.Browsing(m, "Qspiders HLA");	
		System.out.println("**********");
		Google g=new Google();
		b.Browsing(g, "Qspiders OAR");
	}
}

package finalKeyword;

public class D 
{
	final int id;
	String name;
	final String lastname;
	public D(int id,String name,String lastname)
	{
		this.id=id;
		this.name=name;
		this.lastname=lastname;
	}
	public static void main(String[] args) 
	{
		D d=new D(100, "abc", "kumar");
		D d1=new D(200, "cde", "sahoo");
		
		d.name="manoj";
		System.out.println(d.id);
		System.out.println(d.name);
		System.out.println(d.lastname);
		System.out.println("**********");
		d1.name="litu";
		System.out.println(d1.id);
		System.out.println(d1.name);
		System.out.println(d1.lastname);
	}
}

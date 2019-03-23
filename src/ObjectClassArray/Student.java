package ObjectClassArray;

public class Student 
{
	int id;
	String name;
	Student(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Object s[]=new Object[4];
		s[0]=new Student(100, "manoj");
		s[1]=new Student(200, "kumar");
		s[2]=new Employe(300, "sahoo");
		s[3]=new Employe(400, "litu");
		for (int i = 0; i <=s.length-1; i++) 
		{
			if(s[i] instanceof Student)
			{
				Student s1=(Student)s[i];
				System.out.println(s1.id);
				System.out.println(s1.name);
				System.out.println("*******");
			}
			else
			{
				Employe e=(Employe)s[i];
				System.out.println(e.eid);
				System.out.println(e.ename);
				System.out.println("*******");
			}
		}
	}
}

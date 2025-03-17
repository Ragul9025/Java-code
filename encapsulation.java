package SLA;

class getset
{
	private String name;
	private int age;
	
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public void setname(String n)
	{
		name=n;
	}
	public void setage(int ag)
	{
		age=ag;
	}
	
	
}
class area
{
	int length;
	int breadth;
	public void set(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public int get()
	{
		return length*breadth;
	}
}
class constructor
{
	int empid;
	String empname; 
	constructor()
	{
		System.out.println("hello i am default constructor directly print");
	}
	constructor(int id,String name)
	{
		empid=id;
		empname=name;
	}
	constructor(int stdid,String stdname,String stdcourse,int stdfees,String stdgender)
	{
		System.out.println("student id is :"+stdid);
		System.out.println("student name id :"+stdname);
		System.out.println("student course is :"+stdcourse);
		System.out.println("student fess is :"+stdfees);
		System.out.println("student gender is :"+stdgender);
	}
	
}
public class encapsulation
{   
	private String name;
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) 
	{
		encapsulation e1=new encapsulation();
		e1.setname("vijay");
		System.out.println(e1.getname());
		e1.setname("ragul");
		System.out.println(e1.getname());
         area a1=new area();
         a1.set(22,22);
         System.out.println(a1.get());
         
         constructor c1=new constructor();
         
         constructor c2=new constructor(1,"raj");
	        System.out.println( c2.empid);
	        System.out.println(c2.empname);
	        System.out.println(c1.empname);
        
        System.out.println();
        constructor std=new constructor(1,"king","JAVA",40000,"male");
        
        getset g=new getset();
          g.setage(21);
          g.setname("Ajith");
          System.out.println(g.getname());
          System.out.println(g.getage());
          
	}

}
  
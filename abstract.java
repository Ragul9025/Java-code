package SLA;

 abstract class Employees
{
	 public int number;
	 private String name;
	 private String Address;
	 abstract void c1();

	Employees(int number,String name,String Address)
	{
		this.number=number;
		this.name=name;
		this.Address=Address;
	
	}
	public double computepay()
	{
		System.out.println("computepay");
		return 0.0;
	}
	public void mailcheck()
	{
		System.out.println("mailing check to"+name+" to "+Address);
	}
	public String toString()
	{
		return this.name;
	}


	public String getname()
	{
		return name;
	}
	public void getnum()
	{
		System.out.println(number);
	}
	public void getaddress()
	{
		System.out.println(Address);
	}
}
 class compute extends Employees
 {
	 compute(int number, String name, String Address) 
	 {
		super(number, name, Address);
		
	}


public void c1() 
{
	System.out.println("this is compute c1");
	
}

	 
	 
 }
public class Abstract 
{

	public static void main(String[] args)
	
	{
		
		compute c2=new compute(1,"vasu","wwee");
		c2.computepay();
		 System.out.println(c2.number);
		  System.out.println(c2.getname());
		  c2.getnum();
		  c2.getaddress();
		
		 
		
	}

}

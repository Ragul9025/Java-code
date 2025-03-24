package SLA;
interface in
{
	final int a=2;
	default void display()
	{
		System.out.println("hello iam main display");
	}
	static void disp()
	{
		System.out.println("hiii iam disp");
	}
	
}
interface shape
{
    double getarea();
}
class human implements in
{
//	public void display()
//	{
//		System.out.println("I am display");
//	}
	
}
class  rectangle implements shape
{
	private double length;
	private double bredth;
	 rectangle(double length,double bredth)
	 {
		 this.length=length;
		 this.bredth=bredth;
	 }
	 public double getarea()
	 {
		 return length*bredth;
	 }
	 
}
class  triangle implements shape
{
	private double height;
	private double base;
	 triangle(double height,double base)
	 {
		 this.height=height;
		 this.base=base;
	 }
	 public double getarea()
	 {
		 return height*base;
	 }
	 
}
class  circle implements shape
{
	private double radius;
	
	 circle(double radius)
	 {
		 this.radius=radius;
		 
	 }
	 public double getarea()
	 {
		 return radius;
	 }
	 
}


public class Interface
{
    
	public static void main(String[] args) 
	{
	    System.out.println(in.a);
	    in.disp();
	    human h=new human();
	    h.display();
	   
//	    rectangle r=new rectangle();
//	    triangle t=new triangle();
//	    circle c=new circle();
//	    
//	    r.getrect();
//	    c.getcircle();
//	    t.gettriangle();
	    
	    shape rect=new rectangle(10,5);
	    shape tri=new triangle(10,4);
	    shape cir=new circle(3.14);
	    System.out.println(rect.getarea());
	    System.out.println(tri.getarea());
	    System.out.println(cir.getarea());
	    
	    
	    
	}

}

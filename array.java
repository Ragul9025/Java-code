package SLA;

import java.util.Arrays;

class Student
{
	private int no;
	private String name;
	
//	Student(int no,String name)
//	{
//		this.no=no;
//		this.name=name;
//	}
	public  void display()
	{
		System.out.println("The number is "+no +" the name is "+name);
	}
}
class check
{
	
	void var(int ab,int b,int cd)
	{
		cd=ab*b;
		System.out.println("c is "+cd);
	}
	public void print(int arr[])
	{
		int v=1; 
		for(int i=0;i<arr.length;i++)
		{
			if(i==0)
			{
			arr[i]=v;
			}
			else
			{
				arr[i++]=v+2+i;
				System.out.println("it is i"+ i);
				v+=3;
			}
			
		}
		
	}
	public void change(String s)
	{
		s=s+"hiy";
		System.out.println(s);
	}
}
public class Array {

	public static void main(String[] args)
	{
		Student a[]=new Student [2];
//        a[0]=new Student(1,"kk");
//        a[1]=new Student(2,"pp");
		a[0]=new Student();
		a[1]=new Student();
        a[0].display();
        a[1].display();
        int ar[]= {1,2,3,4,5};
        String ss="hey";
        System.out.println(ss);
        
       check c=new check();
       c.change(ss);
       System.out.println(ss);
//        c.print(ar);
//        int ab=7;int b=6;int cd=0;
//        System.out.println(Arrays.toString(ar));
//        c.var(ab, b, cd);
//        System.out.println(cd);
         

	}

}


package SLA;

class student
{
	int x=5;
	String name="ajay";
	boolean j=true;
	
	public static void call()
	{
		System.out.println("i am static method");
	}
	
}

public class loop {

	public static void main(String[] args) 
	{
		
	
		// print 1-10
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
			
			
		}
		System.out.println();
		//print 2-10 even
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i);
			}
			
			
		}
		System.out.println();
		//print 1-9 odd
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i);
			}
		}
		System.out.println();
		//print 10-1 reverse
		
		for(int i=10;i>0;i--)
		{
			System.out.print(i);
		}
		System.out.println();
		
		student s1=new student();
		System.out.println(s1.x);
		System.out.println(s1.name);
		System.out.println(s1.j);
		
		//dont use loop only increment operator  to print 1-10
		int k=1;
		System.out.print(k++);
		System.out.print(k++);
		System.out.print(k++);
		System.out.print(k++);
		System.out.print(k++);
		System.out.print(k++);
		System.out.print(k++);
		System.out.print(k++);
		System.out.print(k++);
		System.out.print(k++);
		
		System.out.println();
		call();
		
		s1.call();
		
		
	}

	private static void call() {
		System.out.println("hello buddy");
		
	}



}

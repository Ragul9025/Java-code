package SLA;

public class whileloop {

	public static void main(String[] args)
	{
		int a=1;
		while(a<=10)
		{
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		a=1;
		while(a<=10)
		{
			if(a%2==0)
			{
				System.out.print(a);
			}
			 a++; 
		}
		System.out.println();
		int k=1;
		while(k<=10)
		{
			if((k/2)*2!=k)
			{
				System.out.print(k);
			}
			k++;
		}
		System.out.println();
	    k=2;
	    while(k<=10)
	    {
	    	System.out.print(k);
	    	k+=2;
	    }
	    int u=37498;
		String s=String.valueOf(u);
		System.out.println(s);
		
		int y=u/10000 *(10000);
		System.out.println(y);
		
	}

}

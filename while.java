package SLA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
//import java.time.LocalTime;
import java.util.*;


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
		System.out.println();
		
	LocalDate d=LocalDate.now();
	LocalTime t=LocalTime.now();
	System.out.println(d);
	System.out.println(t);
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the time this format: DD/MM/YYYY");
		
		String in=scan.next();
		SimpleDateFormat df=new SimpleDateFormat("dd/mm/yyyy");
		try {
			//1.initialize date
			//2.parsing scanner obj
			//3.input from the user with right format
			 Date date=df.parse(in);
			 System.out.println("input date ->"+df.format(date));
		  }
		catch(ParseException e)
		{
			System.out.println("invalid date format");
		}
	
		
		
		int num=4321;
		int copy=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("The number is :"+copy+"\nThe reverse number is "+rev);
		
		int de=1;
		do
		{
			System.out.println("heloo");
			de++;
		}while(de<1);
		//task
		//1 print ascii value do while
		char dd=1;
		do
		{
			System.out.print(dd);
			dd++;
		}while(dd<257);
		
		
		//random number to get user 
		System.out.println();
		System.out.println("Enter your name :");
		String na=scan.nextLine();
		
		int ss=(int)(Math.random()*10);
		System.out.println("The randum number is :"+ss);
		int count=0;
		int gusnum=0;
		System.out.println("Enter the number you guess 1-10");
		while(gusnum!=ss)
		{
			
			int number=scan.nextInt();
			gusnum=number;
			count++;
			if(gusnum!=ss)
			{
			   System.out.println("Its not true X -> one more chance :");
			}
	
			
		}
		if(count==1)
		{
			System.out.println(na+" you got it!"+"you guess it" +"'"+count+"'"+"st chance");
		}
		else if(count==2)
		{
		  System.out.println(na+" you got it!"+"you guess it "+"'"+count+"'"+"nd chance");
		}
		else if(count==3)
		{
			System.out.println(na+" you got it!"+"you guess it "+"'"+count+"'"+"rd chance");
		}
		else 
		{
			System.out.println(na+" you got it!"+"you guess it "+"'"+count+"'"+"th chance");
		}
	
		//3.print z-a using for loop
		char alphabet='z';
		for(int p=1;p<27;p++)
		{
			System.out.print(alphabet--+" ");
		}
		// 4.reverse natural number using while loop
		System.out.println();
		System.out.println("Which numbers to you want reverse :");
		int getin=scan.nextInt();
		int start=1;
		while(start<=getin)
		{
			System.out.print(getin+" ");
			getin--;
		}
		
	}

}

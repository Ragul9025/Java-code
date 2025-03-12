package SLA;
import java.util.*;
public class basic {

	public static void main(String[] args)
	{
	      int a=1234;
	      double b=7.89;
	      float f=5.67f;
	      char c='/';
	      char g=65,h=90,k=122,o=97;
	      String s="hello";
	      boolean e=true;
	      System.out.println(a);
	      System.out.println(b);
	      System.out.println(c);
	      System.out.println(g);
	      System.out.println(f);
	      System.out.println(s);
	      System.out.println(e);
	      System.out.println(h);
	      System.out.println(k);
	      System.out.println(o);
	      
	             for(int i=1;i<=10;i++)
	     		  {
	            	if(i<5)
	            	{
	    	         System.out.print(i);
	            	}
	            	else if(i==5)
			            	{
			            		System.out.println();
			            		System.out.println("lets start");
			            		System.out.print(i);
			            	}
		         	else
		         	{
		         		System.out.print(i);
		         	}
	     		  }	
	             System.out.println();
	    
//	           System.out.println(++l+""+ ++l);
	           
	           int age=18;
	           if(age>=18)
	           {
	        	   System.out.println("you are eligible to vote");
	           }
	           else if(age>=22)
	           {
	        	   System.out.println("you are adult unmarried");
	           }
	           else
	           {
	        	   System.out.println("you are not eligible");
	           }
	           int v=1;
		          
	           int l=10;
	           
	           System.out.println(v++ +""+ v++ +""+v++ +""+v++ +""+v++ +""+v++ +""+v++ +""+v++ +""+v++ +""+v++ );
	           
	           System.out.println(l-- +""+l-- +"" + l-- +"" +l-- +"" +l-- +"" +l--+""+l-- +l-- +""+l-- +""+l--);
	           
	           int x=2;
	           
//	           System.out.println(x +""+(x+2)+ (x+4)+(x+6)+(x+8));
	           Scanner scan=new Scanner(System.in);
	           int arr[]=new int[5];
	           System.out.println("enter five values");
	           for(int i=0;i<arr.length;i++)
	           {
	        	  
	        	   arr[i]=scan.nextInt(); 
	           }
	           
	           Arrays.toString(arr);
	           ArrayList list=new ArrayList();
	         
	           list.add("one");
	           list.add("two");
	           list.add("three");
	           list.add("four");
	           list.add("five");
	          int re=0;
	        System.out.println(arr[3]);
	           while(re!=5)
	           { 
	        	   System.out.println("you want enter the number");
	        	   int ge=scan.nextInt();
	        	   re=ge;
	              System.out.println(list.get(ge-1)+" : "+arr[ge-1]);
	           }
	          
	           

	           
	           
	}

}

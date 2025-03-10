

public class CompariosonAndcasecading 
{
	public boolean palindrome(int x)
	{
		int a=x;
	    int same=a;
        int rev=0;
        
        if(a<0)
        {
        return false;
        }
        else
        {
		 while(a!=0)
	        {
	        	rev=rev*10+a%10;
	        	a=a/10;
	        }
		 if(same==rev)
         {
        	 return true;
         }
         else
         {
        	 return false;
         }
        }
	        
	}

	public static void main(String[] args)
	{
      //samller sixe data type to change larger size datatype
         int myint=9;
         double mydouble=myint;
         System.out.println("the value is change double "+mydouble);
         
         double my=9.546;
         int my1=(int)mydouble;
         System.out.println("double  value to int  "+my1);
         
         String mystr=String.valueOf(myint);
         System.out.println("string to int "+ mystr);
         
        int a=12521;
         
        CompariosonAndcasecading obj=new CompariosonAndcasecading();
        

       
        
	}

}

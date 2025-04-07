package SLA;

public class Wrapper
{

	public static void main(String[] args) 
	{
		// converting int into Integer
		int a=10;
		Integer i=a; //This time i is a object because is a class
		Integer j=Integer.valueOf(a);
		System.out.println(a+""+i);//converting int into Integer explicity
		System.out.println(j);//autoboxing,now compiler will write Integer.valueOf(a) internally
        
		long l=234;
		byte b=2;
		float f=34.02F;// why we are using F hear
					  //because the size is unpredictable so we are using F.
		short s=12;
		double d=323.02D;
		char c='a';
		boolean k=true;
		//autoboxing:primitive data type into object 
		
		Byte byteobj=b;
		Short shortobj=s;
		Long longobj=l;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=k;
		Float flobj=f;
		System.out.println("Byteobj "+byteobj);
		System.out.println("Double object "+doubleobj);
		System.out.println("charobj "+charobj);
		System.out.println("boolobj "+boolobj);
		System.out.println("Longobj "+longobj);
		System.out.println("Shortobj "+shortobj);
		System.out.println("floatobj "+flobj);
		
		//unboxing : object into primitive data type
		
		byte byval=byteobj;
		short sval=shortobj;
		double dval=doubleobj;
		char chval=charobj;
		long longval=longobj;
		boolean boolval=boolobj;
		float flval=flobj;
		
		System.out.println("byte value "+byval);
		System.out.println("short value "+sval);
		System.out.println("long value "+longval);
		System.out.println("char value "+chval);
		System.out.println("double value "+dval);
		System.out.println("float value "+flval);
		System.out.println("bool value "+boolval);
		
		Wrapper wr=new Wrapper();
	
		
	}

}

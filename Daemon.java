package Thread;

public class Daemon {

	public static void main(String[] args) 
	{
		Thread daemon=new Thread(()->
		{
			while(true)
			{
				System.out.println("Thread is running ");
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
		});
	   daemon.setDaemon(true);
		daemon.start();
		
		

	}

}

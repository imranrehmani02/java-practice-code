
public class Mt6 extends Thread{
	public void run()                //Running state
	{
		for(int i=10; i<=20; i++)
		{
			try
			{
				Thread.sleep(200);     //Sleep state
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println(i);        //Exit state,Terminated
		}
	}

	public static void main(String[] args) {
		Mt6 m1=new Mt6();
		Mt6 m2=new Mt6();
		
		m1.start();
		m2.start();                   //Runnable state
	}

}

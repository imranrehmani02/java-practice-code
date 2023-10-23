
public class MT8 extends Thread
{
public void run()
{
for(int i=1;i<=5; i++)
{
try
{
Thread.sleep(500);	
}
catch(Exception e)
{
System.out.println(e);	
}
System.out.println(i);	
}
}
	public static void main(String[] args) {
		MT8 m1=new MT8();
		MT8 m2=new MT8();
		MT8 m3=new MT8();
		
		m1.start();
		m2.start();
		m3.start();

	}

}

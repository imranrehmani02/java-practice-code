
public class MT7 implements Runnable{
public void run()
{
for(int i=10; i<=15; i++)
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
public static void main(String args[])
{
MT7 m7=new MT7();
Thread t1=new Thread(m7);
t1.start();
Thread t2=new Thread(m7);
t2.start();
}
}

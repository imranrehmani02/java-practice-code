public class MT5 extends Thread
{
public void run()
{
for(int i=1; i<=5; i++)
{
try
{
Thread.sleep(2000);
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
MT5 m5=new MT5();
m5.start();
}
}
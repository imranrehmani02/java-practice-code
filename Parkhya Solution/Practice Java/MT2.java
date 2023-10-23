public class MT2 implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
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
MT2 m2=new MT2();
Thread t1=new Thread(m2);
Thread t2=new Thread(m2);
t1.start();
t2.start();
}
}
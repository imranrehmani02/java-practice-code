class Demo implements Runnable
{
public void run()
{
for(int i=1; i<=5; i++)
{
try
{
Thread.sleep(1000);
System.out.println(i);
}catch(Exception e)
{
System.out.println(e);
}
}
}

public static void main(String aa[])
{
Demo d=new Demo();
Thread t=new Thread(d);
Thread t1=new Thread(d);
Thread t2=new Thread(d);
t.start();
t1.start();
t2.start();
}
}
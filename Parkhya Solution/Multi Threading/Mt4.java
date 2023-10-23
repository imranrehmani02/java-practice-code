//Multi Threading

class MT4 implements Runnable
{
public void run()
{
for(int i=1; i<=5; i++)
{
try
{
Thread.sleep(1000);
System.out.println(i);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
public static void main(String args[])
{
MT4 m4=new MT4();
Thread t1=new Thread(m4);
Thread t2=new Thread(m4);
Thread t3=new Thread(m4);
t1.start();
t2.start();
t3.start();
}
}
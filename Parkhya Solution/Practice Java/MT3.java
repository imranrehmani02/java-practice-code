public class MT3 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
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
MT3 m1=new MT3();
MT3 m2=new MT3();
MT3 m3=new MT3();

m1.start();
m1.join();
m2.start();
m3.start();
}
}
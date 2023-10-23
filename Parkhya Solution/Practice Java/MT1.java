public class MT1 extends Thread
{
public void run()
{
for(int i=0; i<=20; i++)
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
MT1 m1=new MT1();
MT1 m2=new MT1();

m1.start();
m2.start();
}
}
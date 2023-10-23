class Demo
{
synchronized static void show(int n)
{
for(int i=1; i<=5; i++)
{
try
{
Thread.sleep(500);
System.out.println(n+i);
}catch(Exception e)
{
System.out.println(e);
}
}
}
}

class Psp1 implements Runnable
{
public void run()
{
Demo.show(10);
}
}

class Psp2 implements Runnable
{
public void run()
{
Demo.show(100);
}
}

class Main
{
public static void main(String aa[])
{
Psp1 p1=new Psp1();
Psp2 p2=new Psp2();

Thread t=new Thread(p1);
Thread t1=new Thread(p2);

t.start();
t1.start();
}
}
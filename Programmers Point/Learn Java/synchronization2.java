class Demo
{
synchronized void show(int n)
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
Demo d;
Psp1(Demo d)
{
this.d=d;
}
public void run()
{
d.show(10);
}
}

class Psp2 implements Runnable
{
Demo d;
Psp2(Demo d)
{
this.d=d;
}
public void run()
{
d.show(100);
}
}

class Main
{
public static void main(String aa[])
{
Demo a=new Demo();
Psp1 p1=new Psp1(a);
Psp2 p2=new Psp2(a);

Thread t=new Thread(p1);
Thread t1=new Thread(p2);

t.start();
t1.start();
}
}
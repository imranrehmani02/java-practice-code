class Demo implements Runnable
{
public void run()
{
Thread a=Thread.currentThread();
System.out.println(a.getName());
}
public static void main(String aa[])
{
Demo d=new Demo();
Thread t=new Thread(d);
Thread t1=new Thread(d);
Thread t2=new Thread(d);
t.setName("one");
t1.setName("two");
t2.setName("three");

t.start();
t1.start();
t2.start();
}
}
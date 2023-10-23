class Priority extends Thread
{
public void run()
{
System.out.println("running thread name is "+Thread.currentThread().getName());

System.out.println("running thread priority is "+Thread.currentThread().getPriority());
}

public static void main(String args[])
{
Priority p1=new Priority();
Priority p2=new Priority();
Priority p3=new Priority();
Priority p4=new Priority();

p1.setPriority(Thread.MIN_PRIORITY);
p2.setPriority(Thread.NORM_PRIORITY);
p3.setPriority(Thread.MAX_PRIORITY);
p4.setPriority(7);

p1.start();
p2.start();
p3.start();
p4.start();
}
}
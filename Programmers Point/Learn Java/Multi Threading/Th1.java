class Th1 extends Thread
{
public void run()
{
System.out.println("Thread is running");
}
public static void main(String args[])
{
Th1 t1=new Th1();
t1.start();
}
}
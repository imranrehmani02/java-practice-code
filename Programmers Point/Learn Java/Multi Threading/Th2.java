class Th2 implements Runnable
{
public void run()
{
System.out.println("Thread 2 is running");
}
public static void main(String args[])
{
Th2 t2=new Th2();
Thread t21=new Thread(t2);
t21.start();
}
}
class MT3 implements Runnable
{
public void run()
{
System.out.println("Thread is running");
}
public static void main(String args[])
{
MT3 m3=new MT3();
Thread t1=new Thread(m3);
t1.start();
}
}
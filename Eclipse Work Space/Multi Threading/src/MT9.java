
public class MT9 extends Thread
{
public void run()
{
	System.out.println("running thread name is "+Thread.currentThread().getName());
	System.out.println("running thread priority is "+Thread.currentThread().getPriority());	
}
	public static void main(String[] args) {
MT9 m1=new MT9();
MT9 m2=new MT9();
MT9 m3=new MT9();
MT9 m4=new MT9();

m1.setPriority(Thread.MIN_PRIORITY);
m3.setPriority(Thread.NORM_PRIORITY);
m2.setPriority(Thread.MAX_PRIORITY);
m4.setPriority(7);
	
m1.start();
m2.start();
m3.start();
m4.start();
	}

}

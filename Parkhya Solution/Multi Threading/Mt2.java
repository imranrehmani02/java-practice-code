class H extends Thread
{
public void run()     //pre defined mathod
{
for(int i=0; i<20; i++)
{
System.out.println(i);
}
}
}

public class MT2
{
public static void main(String args[])
{
H h1=new H();
h1.start();
}
}
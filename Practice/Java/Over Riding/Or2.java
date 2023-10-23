class Demo
{
void run()
{
System.out.println("run is running from demo");
}
}


class Or2 extends Demo
{
void run()
{
System.out.println("run is running from Or2");
}

public static void main(String args[])
{
Demo d=new Or2();        //upcasting
d.run();
}
}
class Demo
{
public void finalize()
{
System.out.println("object gone");
}
public static void main(String aa[])
{
Demo d=new Demo();
Demo d1=new Demo();
d=null;
d1=d;
System.gc();
}
}
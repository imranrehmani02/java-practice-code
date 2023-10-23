class A
{
int i;
}

public class Co1
{
public static void main(String args[])
{
A a1=new A();
a1.i=10;
System.out.println(a1.i);

A a2=new A();
a2.i=25;
System.out.println(a2.i);
}
}
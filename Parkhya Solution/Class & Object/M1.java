class A
{
int i;
}

class M1
{
public static void main(String args[])
{
A a1=new A();
a1.i=10;

A a2=new A();
a2.i=30;

System.out.println(a1);      //address of refrences
System.out.println(a2);      //address of refrences
}
}
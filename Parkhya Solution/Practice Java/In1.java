class A
{
int i=20;
}

class In1 extends A
{
int j=56;
public static void main (String args[])
{
In1 b1=new In1();
System.out.println(b1.i);
System.out.println(b1.j);
int c=b1.i+b1.j;
System.out.println(c);
}
}
interface Printable
{
void print();
}

interface Showable
{
void print();
}

class A8 implements Printable,Showable
{
public void print()
{
System.out.println("Hello print");
}
public static void main(String args[])
{
A8 b=new A8();
b.print();
}
}
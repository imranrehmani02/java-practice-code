interface Printable
{
void print();

static void run()
{
System.out.println("Yes I am new. - static");
}

default void run1()
{
System.out.println("Yes I am new. - default");
}
}

interface Showable
{
void print();
}

class A9 implements Printable,Showable
{
public void print()
{
System.out.println("Hello");
}

public static void main(String args[])
{
A9 ab=new A9();
ab.print();
ab.run1();
Printable.run();
}
}
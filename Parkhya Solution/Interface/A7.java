interface Printable
{
void print();
}
interface Showable
{
void show();
}

class A7 implements Printable,Showable
{
public void print()
{
System.out.println("Hello Print");
}

public void show()
{
System.out.println("Hello Welcome");
}
public static void main(String aa[])
{
A7 a=new A7();
a.print();
a.show();
}
}
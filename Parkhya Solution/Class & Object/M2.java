class B
{
int i;
}

public class M2
{
public static void main(String args[])
{
B b1=new B();
b1.i=50;

String s1=b1.toString();
System.out.println(s1);          // same address of refrences
System.out.println(b1);          // same address of refrences
}
}
class B
{
int i;
}

public class Co2
{
public static void main(String args[])
{
B b1=new B();
b1.i=36;
String s1=b1.toString();
System.out.println(b1);
System.out.println(s1);
}
}
class C
{
int i;
C(int i)
{
this.i=i;
}
}

public class Co3
{
public static void main(String args[])
{
C c1=new C(12);
String s1=c1.toString();
String s2="address "+c1;

System.out.println(c1);
System.out.println(s1);
System.out.println(s2);
System.out.println(c1.i);
}
}
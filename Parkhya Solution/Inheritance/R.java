class P
{
P()
{
System.out.println("P()");
}
}
class Q extends P
{
Q()
{
System.out.println("Q()");
}
}

class R
{
public static void main(String aa[])
{
Q q1=new Q();
System.out.println("----------");
P p1=new P();
System.out.println("----------");
}
}
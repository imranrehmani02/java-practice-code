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
super();
System.out.println("Q()");
}
}

class T extends Q
{
T()
{
super();
System.out.println("T()");
}
}
class R
{
public static void main(String args[])
{
/*Q q1=new Q();
System.out.println("---------");
P p1=new P();
System.out.println("---------");*/
T t1=new T();
System.out.println("---------");
}
}
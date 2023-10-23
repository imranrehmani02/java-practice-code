class C
{
C(int i)
{
System.out.println("C(int)");
}
}

class D1 extends C
{
D1(int i)
{
super(i);
System.out.println("D(int)");
}
public static void main(String args[])
{
C c1=new C(10);
System.out.println("--------");
D1 d1=new D1(20);
System.out.println("---------");
}
}

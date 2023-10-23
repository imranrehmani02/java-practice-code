class C
{
void test()
{
System.out.println("from C test");
}
}

class D extends C
{
void test()
{
System.out.println("from D test");
}
}

class Manager
{
static void method(C c1)
{
c1.test();
}
public static void main(String args[])
{
C c1=new C();
C c2=new D();

method(c1);
method(c2);
}
}
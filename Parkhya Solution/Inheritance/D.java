class C
{
int i;
void test1()
{
System.out.println("from test 1");
}
}
class D extends C
{
int j;
void test2()
{
System.out.println("from test 2");
}
public static void main(String aa[])
{
D d1=new D();
D d2=new D();
d1.test1();
d2.test2();
d1.i=10;
d2.j=20;
System.out.println(d1.i+" "+d2.j);
}
}
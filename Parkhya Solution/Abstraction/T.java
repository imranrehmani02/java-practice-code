abstract class P
{
void test1()
{
System.out.println("test 1");
}
}

abstract class Q
{
}

class R extends P
{
}

class S extends Q
{
}

class T
{
public static void main(String args[])
{
System.out.println("--------");
System.out.println("--------");
R r1=new R();
r1.test1();
System.out.println("--------");
S s1=new S();
System.out.println("--------");
}
}
abstract class J
{
abstract void test1();
abstract void test2();

void test3()
{
System.out.println("test 3");
}
}

abstract class K extends J
{
void test1()
{
System.out.println("test 1");
}
}

class L extends K
{
void test2()
{
System.out.println("test 2");
}

public static void main(String args[])
{
L l1=new L();
l1.test1();
l1.test2();
l1.test3();
System.out.println("done");
}
}
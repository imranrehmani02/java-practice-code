abstract class K1
{
abstract void  test1();
abstract void  test2();
abstract void  test3();
abstract void  test4();
}

abstract class L1 extends K1
{
void test1()
{
System.out.println("test 1");
}
abstract void  test5();
}

class M1 extends L1
{
void test2()
{
System.out.println("test 2");
}
void test3()
{
System.out.println("test 3");
}
void test4()
{
System.out.println("test 4");
}
void test5()
{
System.out.println("test 5");
}

public static void main(String aa[])
{
M1 m1=new M1();
m1.test1();
m1.test2();
m1.test3();
m1.test4();
m1.test5();
System.out.println("Done");
}
}
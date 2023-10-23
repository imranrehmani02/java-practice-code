abstract class H
{
abstract void test1();
abstract void test2();
abstract void test3();
}

class I extends H
{
void test1()
{
System.out.println("test 1");
}

void test2()
{
System.out.println("test 2");
}
void test3()
{
System.out.println("test 3");
}

public static void main(String args[])
{
I i1=new I();
i1.test1();
i1.test2();
i1.test3();
}
}
interface Inter3
{
void test1();
void test2();
}

interface Inter4 extends Inter3
{
void test3();
}

public class Inter5 implements Inter4
{
public void test1()
{
System.out.println("test 1");
}
public void test2()
{
System.out.println("test 2");
}
public void test3()
{
System.out.println("test 3");
}
public static void main(String args[])
{
Inter5 i5=new Inter5();
i5.test1();
i5.test2();
i5.test3();
}
}
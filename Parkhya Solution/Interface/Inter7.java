interface Inter5
{
int test1();
void test2();
}

abstract class Inter6 implements Inter5
{
public int test1()
{
System.out.println("test 1");
return 100;
}
}

public class Inter7 extends Inter6
{
public void test2()
{
System.out.println("test 2");
}
public static void main(String args[])
{
Inter7 i1=new Inter7();
i1.test1();
i1.test2();
System.out.println("done");
}
}
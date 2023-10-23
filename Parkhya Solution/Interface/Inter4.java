interface Inter3
{
void test1();
void test2(int i);
}

public class Inter4 implements Inter3
{
public void test1()
{
System.out.println("test 1");
}
public void test2()
{
System.out.println("test 2");
}

public static void main(String args[])
{
Inter4 i4=new Inter4();
i4.test1();
i4.test2(4);
System.out.println("done");
}
}
interface Inter1
{
void test1();
}

public class Inter2 implements Inter1
{
public void test1()
{
System.out.println("from test 1");
}
public static void main(String args[])
{
Inter1 i1=null;

Inter2 i2=new Inter2();
i2.test1();
System.out.println("done");
}
}
interface Inter1
{
void test1();
}

class Inter2 implements Inter1
{
public void test1()
{
System.out.println("test 1");
}
public static void main(String args[])
{
Inter2 i2=new Inter2();
i2.test1(); 
}
}
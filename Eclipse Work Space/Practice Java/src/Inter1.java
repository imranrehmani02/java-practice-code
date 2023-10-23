interface one
{
void test1();	
}
public class Inter1 implements one{
public void test1()
{
System.out.println("test1 from one interface");	
}
public static void main(String args[])
{
Inter1 i1=new Inter1();
i1.test1();
}
}

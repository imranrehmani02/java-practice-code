interface One1
{
void test1();	
}
interface Two2 extends One1
{
void test2();	
}
public class Inter2 implements Two2
{
	public void test1()
	{
		System.out.println("One interface");
	}
	public void test2()
	{
		System.out.println("two interface");
	}
public static void main(String args[])
{
Inter2 i2=new Inter2();
i2.test1();
i2.test2();
}
}

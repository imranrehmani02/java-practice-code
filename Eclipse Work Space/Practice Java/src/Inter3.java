interface Abc
{
void test1();
void test2(int a);
}

public class Inter3 implements Abc
{
	public void test1()
	{
		System.out.println("Abc interface");
	}
	public void test2(int a)
	{
		System.out.println("Abc interface "+a);
	}
public static void main(String args[])
{
Inter3 i=new Inter3();
i.test1();
i.test2(365);
}
}

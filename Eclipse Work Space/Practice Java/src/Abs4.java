abstract class A1
{
abstract void test1();
abstract void test2();
abstract void test3();
}

abstract class A2 extends A1
{
void test1()
{
System.out.println("test 1");	
}
abstract void test4();
}
public class Abs4 extends A2
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
public static void main(String args[])
{
Abs4 s=new Abs4();	
s.test1();
s.test2();
s.test3();
s.test4();
}
}

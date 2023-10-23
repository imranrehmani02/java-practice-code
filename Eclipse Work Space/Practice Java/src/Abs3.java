abstract class A1
{
abstract void test1();
abstract void test2();
void test3()
{
	System.out.println("Test 3");
	}
}

abstract class A2 extends A1
{
void test1()
{
System.out.println("test 1");	
}
}

class Abs3 extends A2
{
void test2()
{
	System.out.println("test 2");	
}
public static void main(String args[])
{
Abs3 a3=new Abs3();
a3.test1();
a3.test2();
a3.test3();
}
}
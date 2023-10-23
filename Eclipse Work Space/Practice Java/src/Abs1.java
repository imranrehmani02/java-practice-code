
abstract class A {
abstract void test1();
void test2()
{
System.out.println("test 2");	
}
}

class Abs1 extends A
{
void test1()
{
	System.out.println("test 1");	
}
public static void main(String args[])
{
	Abs1 a1=new Abs1();
	a1.test1();
	a1.test2();
	System.out.println("Done");
}
}

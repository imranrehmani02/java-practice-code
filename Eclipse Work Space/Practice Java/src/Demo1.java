class J
{
static void test()
{
System.out.println("from J class");	
}
}

class K extends J
{
static 
{
	System.out.println("from K class static block");	
}
}
public class Demo1 {
public static void main(String args[])
{
K.test();
J.test();
}
}

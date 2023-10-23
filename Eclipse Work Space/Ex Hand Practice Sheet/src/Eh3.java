
public class Eh3 {
public static void main(String args[])
{
	System.out.println(0);
	test();
	System.out.println(2);
}
public static void test()
{
	System.out.println(3);
	//int i=10/0;
	test2();
	System.out.println(4);
}
public static void test2()
{
String a=null;
System.out.println(a.length());
}
}

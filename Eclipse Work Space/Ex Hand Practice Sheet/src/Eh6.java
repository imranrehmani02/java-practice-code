
public class Eh6 {
public static void main(String args[])
{
	System.out.println(1);
	test();
	System.out.println(2);
}
static void test()
{
	System.out.println(3);
	test();
	System.out.println(4);
}
}

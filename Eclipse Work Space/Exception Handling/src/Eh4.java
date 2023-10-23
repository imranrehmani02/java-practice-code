
public class Eh4 {
static void test()
{
	System.out.println(1);
	test2();
	System.out.println(2);
}	

static void test2()
{
System.out.println(3);
int i=Integer.parseInt("ABC");
System.out.println(4);
}
	public static void main(String[] args) {
		System.out.println(5);
		test();
		System.out.println(6);

	}

}

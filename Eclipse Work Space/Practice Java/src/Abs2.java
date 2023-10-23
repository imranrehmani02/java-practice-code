abstract class B
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	}
public class Abs2 extends B{
	void test1()
	{
		System.out.println("Test 1");
	}

	void test2()
	{
		System.out.println("Test 2");
	}
	
	void test3()
	{
		System.out.println("Test 3");
	}
	public static void main(String[] args) {
		Abs2 a2=new Abs2();
		a2.test1();
		a2.test2();
		a2.test3();

	}

}


public class Eh10 {
public static void main(String args[])
{
	System.out.println(1);
	try
	{
		System.out.println(2);
		int a=10/0;
		System.out.println(3);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
		System.out.println(4);
		e.printStackTrace();
	}
	System.out.println(6);
}
}

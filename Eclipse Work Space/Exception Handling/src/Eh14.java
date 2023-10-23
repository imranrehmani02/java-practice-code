
public class Eh14 {

	public static void main(String[] args) {
System.out.println(1);
try
{
	System.out.println(2);
	int i=10/0;
	System.out.println(3);
}
catch(ArithmeticException e)
{
	System.out.println(4);
	try
	{
		System.out.println(5);
		int i=20/0;
		System.out.println(6);
	}
	catch(ArithmeticException e2)
	{
		System.out.println(7);
	}
	System.out.println(8);
}
System.out.println(9);

	}
	

}

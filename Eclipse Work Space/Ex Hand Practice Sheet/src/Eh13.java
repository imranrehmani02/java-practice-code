
public class Eh13 {
public static void main(String args[])
{
	System.out.println(1);
	int i=10/0;
	try
	{
		System.out.println(2);
	}catch(Exception e)
	{
		System.out.println(3);
	}
}
}

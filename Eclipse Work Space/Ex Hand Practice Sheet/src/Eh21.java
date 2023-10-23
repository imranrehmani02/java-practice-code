
public class Eh21 {

	public static void main(String[] args) {
		if(false)
		{
			return;
		}
		try
		{
			System.out.println(1);
			return;
		}
		catch(ArithmeticException e)
		{
			System.out.println(3);
		}
		finally
		{
			System.out.println(4);
		}
		System.out.println(5);
	}

}

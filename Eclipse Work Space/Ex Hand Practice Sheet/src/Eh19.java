
public class Eh19 {

	public static void main(String[] args) {
		try
		{
			System.out.println(1);
			return;
		}
		catch(ArithmeticException e)
		{
			System.out.println(2);
		}
		finally
		{
			System.out.println(3);
		}
		System.out.println(4);
	}

}


public class Eh22 {

	public static void main(String[] args) {
		System.out.println(1);
		int i=Integer.parseInt("Abc");
		System.out.println(2);
		try
		{
			
		}
		catch(NullPointerException e)
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


public class Eh13 {

	public static void main(String[] args) {
		try
		{
			System.out.println(1);
			int i=10/0;
			System.out.println(00);
			int j=10/0;
			System.out.println(2);
		}
		catch(ArithmeticException e)
		{
			System.out.println(3);
			System.out.println(e);
			System.out.println(e);
			System.out.println(5);
		}
	}

}

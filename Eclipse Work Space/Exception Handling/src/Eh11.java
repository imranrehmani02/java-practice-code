
public class Eh11 {

	public static void main(String[] args) {
		int i=10;
		try
		{
			System.out.println(i);
		}
		catch(ArithmeticException e)
		{
			System.out.println("="+i);
		}
		System.out.println(i+"=");
	}

}

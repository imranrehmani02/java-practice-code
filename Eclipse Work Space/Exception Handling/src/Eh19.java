import java.util.Scanner;
public class Eh19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter some things");
		String s1=sc.next();
		int i=test(s1);
		System.out.println(i);
	}
	
	static int test(String s)
	{
		int i=0;
		try
		{
			i=Integer.parseInt(s);
			return i;
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			return 0;
		}
		finally
		{
			return 1000;
		}
	}

}

import java.util.Scanner;
public class Eh18 { 
	public static void main(String arsg[])
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("enter some things");
				String s1=sc.next();
				try
				{
					System.out.println(1);
					int i=Integer.parseInt(s1);
					System.out.println(2);
					int k=i/(i-9);
					System.out.println(3);
				}
				catch(NumberFormatException e)
				{
					System.out.println(4);
					System.out.println(e);
					System.out.println(5);
				}
				finally
				{
					System.out.println("finally");
				}
				System.out.println(6);
	}

}
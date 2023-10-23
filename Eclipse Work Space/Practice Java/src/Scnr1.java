import java.util.Scanner;
public class Scnr1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a int ");
		int a=sc.nextInt();
		System.out.println("enter a String");
		String c=sc.nextLine();
		System.out.println("enter a float");
		float b=sc.nextFloat();
		System.out.println("You Entered");
		System.out.println(+a);
		System.out.println(c);
		System.out.println(+b);
	}

}

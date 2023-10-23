package Str1;

public class Str3 {
	public static void main(String args[])
	{
		String c1="Java";
		String c2="Python";
		String c3=new String("Python");
		String c4=new String("Java");
		String c5="Java";
		String c6=new String("Python");
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		
		System.out.println(c1==c3);
		System.out.println(c2==c3);
		System.out.println(c1==c5);
		System.out.println(c6==c3);
		
	}

}

package Str1;

public class Str1 {

	
	public static void main(String args[])
	{
		String s1="String coder1";
		String s2="String coder2";
		String s3=new String("String coder1");
		String s4=new String("String coder2");
		String s5=new String("String coder2");
		
		System.out.println("content wise checking");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println();
		System.out.println("Refrence wise Checking");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s4==s5);
	}
}

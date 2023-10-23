package Scnr;

import java.util.Scanner;

public class Sc1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.nextLine();
		
		System.out.println("enter the gender");
		String gender=sc.nextLine();
		
		
		System.out.println("enter the age");
		int age=sc.nextInt();
		
		System.out.println("enter the mobile no.");
		long mobileno=sc.nextLong();
		
		System.out.println("enter the CGPA");
		double cgpa=sc.nextDouble();
		
		System.out.println("name :-"+name);
		System.out.println("gender :-"+gender);
		System.out.println("age :-"+age);
		System.out.println("mobile no :-"+mobileno);
		System.out.println("CGPA :-"+cgpa);
	}

}

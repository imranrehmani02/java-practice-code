import java.util.Scanner;
public class Sc2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter Student Id");
		int id=sc.nextInt();
		
		System.out.println("enter Student Name");
		String name=sc.nextLine();
		
	System.out.println("enter Student class");
		int cl=sc.nextInt();
		
		System.out.println("enter Student Stream");
		String stream=sc.nextLine();
		
		System.out.println("enter Student Marks");
		double marks=sc.nextDouble();
		
		System.out.println("Id :-"+id);
		System.out.println("Name :-"+name);
		System.out.println("Class :-"+cl);
		System.out.println("Stream :-"+stream);
		System.out.println("marks :-"+marks);
		
		
		
	}

}

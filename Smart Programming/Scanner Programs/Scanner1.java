// Scanner Class

import java.util.Scanner;
class Scanner1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a int number");
int a=sc.nextInt();

System.out.println("enter a Long number");
long b=sc.nextLong();

System.out.println("enter a float number");
float c=sc.nextFloat();

System.out.println("enter a Character");
char d=sc.next().charAt(0);

System.out.println("enter a String");
String e=sc.next();

System.out.println("enter a String Line");
String f=sc.nextLine();

System.out.println();
System.out.println("You Enterned !!!!!");
System.out.println("int = "+a);
System.out.println("Long = "+b);
System.out.println("Float = "+c);
System.out.println("Char = "+d);
System.out.println("String = "+e);
System.out.println("String Line = "+f);
}
}
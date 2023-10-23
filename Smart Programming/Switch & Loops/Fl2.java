//table for loop

import java.util.Scanner;
class Fl2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number that you print table");
int n=sc.nextInt();
for(int i=1; i<=10; i++)
{
int c=n*i;
System.out.println(c);
}
}
}
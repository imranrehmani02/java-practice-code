// Factorial

import java.util.Scanner;
class L9Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
int fact=1;
for(int i=1; i<=n; i++)
{
fact=fact*i;
}
System.out.println("Factorial of "+n+" is "+fact);
}
}
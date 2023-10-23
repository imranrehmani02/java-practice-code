//factorial for loop

import java.util.Scanner;
class Fl3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number that you print factorial");
int n=sc.nextInt();
int i,fact=1;
for(i=1; i<=n; i++)
{
fact =fact*i;
}
System.out.println("Factorial of number "+n+" = "+ fact);
}
}
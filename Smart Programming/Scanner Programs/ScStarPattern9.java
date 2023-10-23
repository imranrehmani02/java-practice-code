//Star Pattern by Scanner

import java.util.Scanner;
class ScStarPattern9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
for(int i=1; i<=n; i++)
{
for(int j=n; j>=i; j--)
{
System.out.print("  "); 
}
for(int j=1; j<=i; j++)
{
System.out.print("* ");
}
for(int j=2; j<=i; j++)
{
System.out.print("* "); 
}
System.out.println(); 
} 

for(int i=2; i<=n; i++)
{
for(int j=1; j<=i; j++)
{
System.out.print("  "); 
}
for(int j=n; j>=i; j--)
{
System.out.print("* "); 
}
for(int j=n-1; j>=i; j--)
{
System.out.print("* "); 
}
System.out.println();
}
}
}
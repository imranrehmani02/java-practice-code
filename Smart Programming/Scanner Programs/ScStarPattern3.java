//Star Pattern by Scanner

import java.util.*;
class ScStarPattern3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();

for(int i=1; i<=n; i++)
{
for(int j=1; j<=i; j++)
{
System.out.print("* ");
}
System.out.println();
}

for(int i=1; i<=n-1; i++)
{
for(int k=n-1; k>=i; k--)
{
System.out.print("* ");
}
System.out.println();
}
}
}
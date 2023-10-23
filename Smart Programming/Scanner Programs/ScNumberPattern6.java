//Number Pattern by Scanner

import java.util.Scanner;
class ScNumberPattern6
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
System.out.print(j+" ");
}

for(int k=i-1; k>=1; k--)
{
System.out.print(k+" ");
}
System.out.println();
}
}
}
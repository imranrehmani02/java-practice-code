//Number Pattern by Scanner

import java.util.Scanner;
class ScNumberPattern4
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
System.out.print(j+" ");
}
System.out.println();
}
}
}
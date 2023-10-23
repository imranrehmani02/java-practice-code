//Star Pattern by Scanner

import java.util.Scanner;
class ScStarPattern12
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter value");
int n=sc.nextInt();

for(int i=0; i<n; i++)
{
for(int j=0; j<n; j++)
{
	if(i==j || i+j==n-1)
	{
	System.out.print("* ");
	}
	else
	{
	System.out.print("  ");
	}
}
System.out.println();
}
}
}
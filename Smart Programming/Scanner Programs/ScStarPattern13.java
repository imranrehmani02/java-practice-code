//Star Pattern by Scanner

import java.util.Scanner;
class ScStarPattern13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
for(int i=1; i<=n; i++)
{
for(int j=1; j<=n; j++)
{
	if (i>=2 && j>=2 && i<=n-1 &&  j<=n-1)
	{
	System.out.print("  ");
	}
	else
	{
	System.out.print("* ");
	}
}
System.out.println();
}
}
}

/*   output

* * * *
*      *
*      *
* * * * 

*/
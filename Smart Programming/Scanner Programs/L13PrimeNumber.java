//Check Prime Number

import java.util.Scanner;
class L13PrimeNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
int n=sc.nextInt();
int temp=0;
for(int i=2; i<=n-1; i++)
{
if(n%i==0)
{
temp=temp+1;
}
}
if(temp>0)
{
System.out.println(n+" is Not Prime Number");
}
else
{
System.out.println(n+" is Prime Number");
}
}
}
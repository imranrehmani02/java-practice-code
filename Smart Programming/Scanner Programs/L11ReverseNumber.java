//Reverse Number

import java.util.*;
class L11ReverseNumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
int n=sc.nextInt();
int rem,rev=0;
while(n>0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println("Reverse Number="+rev);
}
}
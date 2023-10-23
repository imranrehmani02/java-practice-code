//Palindrome number program

import java.util.Scanner;
class L17Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number that you want to check");
int n=sc.nextInt();
int r,d,s=0;
d=n;
while(d>0)
{
r=d%10;
s=(s*10)+r;
d=d/10;
}
if(n==s)
{
System.out.println(n+" is Palindrome");
}
else
{
System.out.println(n+" is not Palindrome");
}
}
}
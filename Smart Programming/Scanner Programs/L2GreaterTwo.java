// WAP a program to find the larger of two numbers

import java.util.*;
class L2GreaterTwo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of A");
int a=sc.nextInt();
System.out.println("Enter value of B");
int b=sc.nextInt();

if(a>b)
{
System.out.println("A is greater");
}
else
{
System.out.println("B is greater");
}
}
}
//Swapping with third variable

import java.util.*;
class L6Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of A");
int a=sc.nextInt();
System.out.println("Enter value of B");
int b=sc.nextInt();
int c;
c=a;
a=b;
b=c;
System.out.println("value of A ="+a);
System.out.println("value of B ="+b);
}
}
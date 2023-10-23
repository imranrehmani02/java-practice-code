//CalC using Switch

import java.util.*;
class L5Calc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first value");
int a=sc.nextInt();
System.out.println("Enter second value");
int b=sc.nextInt();
int c;
System.out.println("Enter + for Addition");
System.out.println("Enter - for Substraction");
System.out.println("Enter * for Multipication");
System.out.println("Enter / for Division");
char ch=sc.next().charAt(0);
switch(ch)
{
case '+' :
c=a+b;
System.out.println("Addition = "+c);
break;

case '-' :
c=a-b;
System.out.println("substraction = "+c);
break;

case '*' :
c=a*b;
System.out.println("Multipication = "+c);
break;

case '/' :
c=a/b;
System.out.println("Division = "+c);
break;

case '%' :
c=a%b;
System.out.println("Module = "+c);
break;

default :
System.out.println("Invalid Option");
}
}
}
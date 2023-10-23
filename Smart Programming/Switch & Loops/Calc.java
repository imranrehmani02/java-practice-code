//Calculator using switch case

import java.util.Scanner;
class Calc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of A");
int a=sc.nextInt();
System.out.println("Enter value of B");
int b=sc.nextInt();

System.out.println("enter + for addition");
System.out.println("enter - for substraction");
System.out.println("enter * for multiply");
System.out.println("enter / for division");
char x=sc.next().charAt(0);
int c;
switch(x)
{
case '+':
c=a+b;
System.out.println("Addition = "+c);
break;

case '-':
c=a-b;
System.out.println("Substraction = "+c);
break;

case '*':
c=a*b;
System.out.println("Multiply = "+c);
break;

case '/':
c=a/b;
System.out.println("Division = "+c);
break;

default:
System.out.println("You choice invalid option");
break;

}
}
}
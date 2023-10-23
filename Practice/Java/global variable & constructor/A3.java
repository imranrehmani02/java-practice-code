class A3
{
public static void main(String args[])
{
int a=40;
int b=20;
String q="+";
switch(q)
{
case "+":
System.out.println("Addition "+a+b);
break;

case "-":
System.out.println("Substraction is "+(a-b));
break;

case "*":
System.out.println("Multiply is "+a*b);
break;

case "/":
System.out.println("Division is "+a/b);
break;

default:
System.out.println("invalid choice");
}
}
}
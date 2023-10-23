//CalC using Switch

class Calc
{
public static void main(String args[])
{
int a=12,b=5,c;
char ch='*';
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
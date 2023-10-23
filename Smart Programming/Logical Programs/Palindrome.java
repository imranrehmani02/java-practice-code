//Palindrome number program

class Palindrome
{
public static void main(String args[])
{
int n=12321, r,d,s=0;
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
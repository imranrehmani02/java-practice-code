class Palindrome
{
public static void main(String aa[])
{
int num=131,reverse=0,r,orignalnum;

orignalnum=num;

while(num!=0)
{
r=num%=10;
reverse=reverse*10+r;
num/=10;
}
}
if(orignalnum=reverse)
{
System.out.println(orignalnum+" is a palindrome");
}
else
{
System.out.println(orignalnum+" is not palindrome");
}
}
}
class Demo
{
public static void main(String aa[])
{
String s="hello";
String rev=" ";
int l=s.length();
for(int i=l-1; i>=0; i--)
{
rev=rev+s.charAt(i);
}
System.out.println(rev);
}
}
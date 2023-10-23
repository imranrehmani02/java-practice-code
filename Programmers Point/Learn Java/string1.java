class Demo
{
public static void main(String aa[])
{
String s="ABCDE";
char ary[]=s.toCharArray();
for(char i:ary)
{
System.out.println(i);
}
byte bary[]=s.getBytes();
for(byte i:bary)
{
System.out.println(i);
}
}
}
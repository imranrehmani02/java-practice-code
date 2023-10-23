//* Overloading use for readability purpose.*//

class OL1
{
static int add(int a,int b)
{
return a+b;
}
static int add(int a,int b,int c)
{
return a+b+c;
}
public static void main(String aa[])
{
System.out.println(add(15,12));
System.out.println(add(15,12,10));
}
}
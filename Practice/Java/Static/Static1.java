class S1
{
static int a=20;
}

class Static1 extends S1
{
static int a=10;
public static void main(String args[])
{
System.out.println(a);
System.out.println(S1.a);
}
}
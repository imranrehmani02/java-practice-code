class C
{
static int a=20;
}

class D
{
static void show()
{
System.out.println("Static Method");
}
}

class E
{
static String r="Hello E String class.";
static void mult(int x,int y)
{
System.out.println("mult is :-"+x*y);
}
}

class St3
{
static double e=365.98;
public static void main(String args[])
{
System.out.println(e);
System.out.println(C.a);
D.show();

System.out.println(E.r);
E.mult(12,10);
}
}
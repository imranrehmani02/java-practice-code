class P2
{
P2()
{
System.out.println("default constructor");
}

P2(int a)
{
System.out.println("parameterised constructor :- cube is "+a*a*a);
}

P2(double a, double b)
{
System.out.println("multiply is "+a*b);
}
public static void main(String args[])
{
P2 d1=new P2();
P2 d2=new P2(5);
P2 d3=new P2(5.2,6.7);
}
}
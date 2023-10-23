class Calc
{
int add(int a,int b)
{
return a+b;
}

double subs(double c,double d)
{
return c-d;
}

double mult(double a,double b)
{
return a*b;
}

int div(int a,int b)
{
return a/b;
}
}


class Demo
{
public static void main(String aa[])
{
Calc d=new Calc();
System.out.println("addition is "+d.add(54,46));
System.out.println("subs is "+d.subs(25.8,12.6));
System.out.println("mult is "+d.mult(12.4,2.6));
System.out.println("div is "+d.div(80,7));
}
}
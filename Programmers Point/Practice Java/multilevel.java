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

class Scalc extends Calc
{
int square(int s)
{
return s*s;
}
int cube(int b)
{
return b*b*b;
}
}

class Demo extends Scalc
{
void show()
{
System.out.println("**CALCULATOR**");
}
public static void main(String aa[])
{
Demo d=new Demo();

d.show();
System.out.println("addition is "+d.add(54,46));
System.out.println("subs is "+d.subs(25.8,12.6));
System.out.println("mult is "+d.mult(12.4,2.6));
System.out.println("div is "+d.div(80,7));
System.out.println("square is "+d.square(7));
System.out.println("cube is "+d.cube(5));
}
}
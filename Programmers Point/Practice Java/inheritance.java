class Calc
{
int add(int a,int b)
{
return a+b;
}
int mult(int a,int b,int c)
{
return a*b*c;
}
double div(double a,double b)
{
return a/b;
}
}

class Dummy extends Calc
{
public static void main(String aa[])
{
Dummy d=new Dummy();
System.out.println("add is "+d.add(20,5));
System.out.println("mult is "+d.mult(2,10,8));
System.out.println("div is "+d.div(14.6,3.6));
}
}

class Demo extends Calc
{
public static void main(String aa[])
{
Demo d=new Demo();
System.out.println("add is "+d.add(20,54));
System.out.println("mult is "+d.mult(2,10,6));
System.out.println("div is "+d.div(14.6,2.5));
}
}
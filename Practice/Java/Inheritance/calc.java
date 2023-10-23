class Math 
{
int square(int a)
{
return a*a;
}

int cube(int b)
{
return b*b*b;
}
}
class Calculator extends Math
{
int add(int a, int b)
{
return a+b;
}

int sub(int a, int b)
{
return a-b;
}

int mult(int a, int b)
{
return a*b;
}

int div(int a, int b)
{
return a/b;
}
}

class Calc extends Calculator
{
void show()
{
System.out.println("***Calculator***");
}
public static void main(String args[])
{
Calc d=new Calc();
d.show();
System.out.println("add is "+d.add(15,20));
System.out.println("subs is "+d.sub(36,16));
System.out.println("mult is "+d.mult(25,4));
System.out.println("div is "+d.div(90,2));
System.out.println("square is "+d.square(5));
System.out.println("cube is "+d.cube(6));
}
}

class Cal extends Calculator
{
void show()
{
System.out.println("+++Calculator+++");
}
public static void main(String args[])
{
Cal c=new Cal();
c.show();
System.out.println("Add is "+c.add(200,500));
System.out.println("Subs is "+c.sub(900,300));
System.out.println("Mult is "+c.mult(250,3));
System.out.println("div is "+c.div(800,2));
System.out.println("square is "+c.square(22));
System.out.println("square is "+c.cube(7));
}
}
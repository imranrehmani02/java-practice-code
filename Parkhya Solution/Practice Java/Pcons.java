class Pcons
{
Pcons()
{
System.out.println("D cons");
}

Pcons(int a,int b)
{
int c=a+b;
System.out.println("Add int "+c);
}

Pcons(double x,double y,double z)
{
double o=x*y*z;
System.out.println("Mult double "+o);
}

public static void main(String args[])
{
Pcons p1=new Pcons();
Pcons p2=new Pcons(12,13);
Pcons p3=new Pcons(11.4,4.36,5.89);
}
}
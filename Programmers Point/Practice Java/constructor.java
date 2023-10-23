class Demo
{
Demo()
{
System.out.println("D cons is runing");
}
Demo(int a)
{
System.out.println(a);
}
Demo(int a,int b)
{
System.out.println("mul is "+a*b);
}
Demo(double a,int b,double c)
{
System.out.println("cons is "+a*b*c);
}
public static void main(String args[])
{
Demo d=new Demo();
Demo d1=new Demo(5);
Demo d2=new Demo(6,3);
Demo d3=new Demo(2.3,5,6.5);
}
}
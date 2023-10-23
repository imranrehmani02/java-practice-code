class Demo
{
int cube(int a)
{
return a*a*a;
}
}

class Or3 extends Demo
{
public static void main(String args[])
{
Or3 d=new Or3();
System.out.println(d.cube(8));
}
}
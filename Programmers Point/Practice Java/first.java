class Dummy
{
private int a=10;
protected int b=20;
public int show()
{
return a;
}
}
 
class Demo extends Dummy
{
public static void main(String args[])
{
Demo d=new Demo();
System.out.println(d.show());
System.out.println(d.b);
d.show();
}
}

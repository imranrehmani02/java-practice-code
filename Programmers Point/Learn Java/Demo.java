class Dummy
{
private int a=10;
protected int show()
{
return a;
}
}

class Demo extends Dummy
{
public static void main(String aa[])
{
Demo d=new Demo();
System.out.println(d.show());

}
}
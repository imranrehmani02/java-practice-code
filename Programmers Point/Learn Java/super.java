class Dummy
{
void show()
{
System.out.println("show from dummy");
}
}

class Demo extends Dummy
{
void show()
{
super.show();
System.out.println("show demo");
}
public static void main(String aa[])
{
Demo d=new Demo();
d.show();
}
}
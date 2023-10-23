/*upcasting*/

class Dummy
{
void show()
{
System.out.println("show is running from Dummy");
}
}

class Demo extends Dummy
{
void show()
{
System.out.println("show is running from Demo");
}
public static void main(String aa[])
{

Demo d=new Demo();
d.show();

Dummy b=new Dummy();
b.show();
}
}
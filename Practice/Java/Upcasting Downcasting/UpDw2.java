class Dummy
{
void show()
{
System.out.println("show is running from dummy");
}
}

public class UpDw2 extends Dummy
{
void show()
{
System.out.println("show is running from UpDw2");
}
public static void main(String args[])
{
Dummy d1=new UpDw2();     //upcasting
Dummy d2=(UpDw2) d1;        //Downcasting

d1.show();
d2.show();
}
}
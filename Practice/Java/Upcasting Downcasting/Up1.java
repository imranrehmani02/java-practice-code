class Demo
{
void show()
{
System.out.println("Show is running from Demo");
}
}

class Up1 extends Demo
{
void show()
{
System.out.println("Show is running from Up1");
}
public static void main(String args[])
{
Demo d=new Up1();     //Upcasting
Demo d1=(Up1) d;       //Downcasting
d.show();
d1.show();
}
}
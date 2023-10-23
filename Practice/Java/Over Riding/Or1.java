class Demo
{
void show()
{
System.out.println("show is running from Demo");
}
}

class Or1 extends Demo
{
void show()
{
System.out.println("show is running from OR1");
}
public static void main(String args[])
{
Or1 d=new Or1();
d.show();
}
}
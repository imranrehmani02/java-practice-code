class F
{
void show()
{
System.out.println("show is running from F");
}
}

class Fnl4 extends F
{
void show()
{
System.out.println("show is running from Fnl4");
}
public static void main(String args[])
{
Fnl4 f1=new Fnl4();
f1.show();
F f2=new F();
f2.show();
}
}
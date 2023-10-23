class Dummy
{
int a=10;
void show()
{
System.out.println("Show in aggregation");
}
}

class Ag1
{
public static void main(String args[])
{
Dummy d=new Dummy();
d.show();
System.out.println("a in aggregation "+d.a);
}
}
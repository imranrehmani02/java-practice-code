class Con2
{
int id;
String name;

Con2(int i,String n)
{
id=i;
name=n;
}

void show()
{
System.out.println(id+" "+name);
}

public static void main(String aa[])
{
Con2 c2=new Con2(101,"Pqr");
c2.show();

Con2 c3=new Con2(102,"Mnp");
c3.show();
}
}
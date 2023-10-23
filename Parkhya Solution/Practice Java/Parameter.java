class Parameter
{
int id;
String name;

void insert(int i,String n)
{
id=i;
name=n;
}

void show()
{
System.out.println(id+" "+name);
}

public static void main(String args[])
{

Parameter p1=new Parameter();
p1.insert(101,"Rahul");
p1.show();

Parameter p2=new Parameter();
p2.insert(102,"Abhi");
p2.show();
}
}
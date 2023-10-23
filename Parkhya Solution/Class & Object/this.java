class This
{
int id;
String name;

This(int id,String name)
{
this.id=id;
this.name=name;
}
void show()
{
System.out.println(id+" "+name);
}

public static void main(String args[])
{
This t1=new This(1011,"Raj");
t1.show();
}
}
class Demo
{
int id;
String name;
static String school="DPS";
Demo(int i, String n)
{
id=i;
name=n;
}

/*void box()
{
school="RPS";
}*/

void table()
{
System.out.println(id+" "+name+" "+school);
}
}

class Static3
{
public static void main(String args[])
{
Demo d1=new Demo(1011,"Nazim");
Demo d2=new Demo(1012,"Bashaar");
Demo d3=new Demo(1013,"Kaif");

//d1.box();
d1.table();
d2.table();
d3.table();
}
}
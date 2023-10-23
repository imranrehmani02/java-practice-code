class F
{
int id;
String name;

void insert(int i,String n)      //formal parameter
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
F f1=new F();
f1.insert(101,"Abc");        //Actual parameter
f1.show();

F f2=new F();
f2.insert(102,"Xyz");        //Actual parameter
f2.show();
}
}
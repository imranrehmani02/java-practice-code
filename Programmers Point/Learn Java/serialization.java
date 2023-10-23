import java.io.*;
class Emp implements Serializable
{
int id;
String name;
Emp(int id, String name)
{
this.id=id;
this.name=name;
}
}

class Demo
{
public static void main(String aa[])
{
try
{
Emp e=new Emp(111,"vikas");
FileOutputStream f=new FileOutputStream("E:\\bb.txt");
ObjectOutputStream o=new ObjectOutputStream(f);
o.writeObject(e);
System.out.println("done");
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
}
import java.io.*;
class Demo
{
public static void main(String aa[])
{
try
{
FileInputStream f=new FileInputStream("E:\\bb.txt");
ObjectInputStream o=new ObjectInputStream(f);
Emp e=(Emp)o.readObject();
System.out.println(e.id+" "+e.name);
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
}
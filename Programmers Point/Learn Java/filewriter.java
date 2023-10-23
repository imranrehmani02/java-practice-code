import java.io.*;
class Demo
{
public static void main(String aa[])
{
try
{
FileWriter f=new FileWriter("aa.txt");
f.write("**this is textual data.**");
f.close();
System.out.println("done");
}catch(Exception e)
{
System.out.println(e);
}
}
}
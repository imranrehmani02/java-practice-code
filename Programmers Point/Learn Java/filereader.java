import java.io.*;
class Demo
{
public static void main(String gg[])
{
try
{
File f=new File("aa.txt");
if(f.exists())
{
FileReader f1=new FileReader(f);
if(f.canRead())
{
int i;
String s=" ";
while((i=f1.read())!=-1)
{
s=s+(char)i;
}
System.out.println(s);
}
else
{
System.out.println("cant read from file");
}
f1.close();
}
else
{
System.out.println("file not exists");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}

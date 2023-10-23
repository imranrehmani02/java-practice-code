import java.io.*;
class Demo
{
public static void main(String gg[])
{
try
{
File f=new File("E:\\Imran.txt");
if(f.exists())
{
System.out.println("already exists");
}
else
{
FileOutputStream f1=new FileOutputStream(f);
if(f.canWrite())
{
f1.write(65);
String s="this is file handling in java";
byte b []=s.getBytes();
f1.write(b);
System.out.println("written at "+f.getPath());
}
else
{
System.out.println("cant write data into file");
}
f1.close();
}
}
catch(Exception e)
{
System.out.println("file not found");
}
}
}
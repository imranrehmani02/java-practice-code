import java.io.*;
class Demo
{
public static void main(String gg[])
{
try
{
File f3=new File("E:\\MIR.txt");
File f4=new File("E:\\MIR.txt");
if(f3.exists() || f4.exists())
{
System.out.println("already exists");
}
else
{
FileOutputStream f1=new FileOutputStream(f3);
FileOutputStream f2=new FileOutputStream(f4);
if(f3.canWrite() && f4.canWrite())
{
ByteArrayOutputStream ba=new ByteArrayOutputStream();
String s=" this is file handling in java ";
byte b []=s.getBytes();
ba.write(b);
ba.writeTo(f1);
ba.writeTo(f2);
System.out.println("written at "+f3.getPath());
System.out.println("written at "+f4.getPath());
}
else
{
System.out.println("cant write data into file");
}
f1.close();
f2.close();
}
}
catch(Exception e)
{
System.out.println("file not found");
}
}
}
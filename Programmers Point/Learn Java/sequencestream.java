import java.io.*;
class Demo
{
public static void main(String aa[])
{
String s1="this is new data";
try
{
File f=new File("E:\\aa.txt");
if(f.exists())
{
FileInputStream f1=new FileInputStream(f);
if(f.canRead())
{
int i;
String s=" ";
while((i=f1.read())!=-1)
{
s=s+(char)i;
}
s=s+s1;
FileOutputStream f2=new FileOutputStream(f);
if(f.canWrite())
{
byte ary[]=s1.getBytes();
f2.write(ary);
System.out.println("successfully written "+f.getPath());
System.out.println("data is "+s1);
}
else
{
System.out.println("cant write data into file");
}
}
else
{
FileOutputStream f2=new FileOutputStream(f);
if(f.canWrite())
{
byte ary[]=s1.getBytes();
f2.write(ary);
System.out.println("successfully written "+f.getPath());
}
else
{
System.out.println("cant write data into file ");
}
f2.close();
}
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
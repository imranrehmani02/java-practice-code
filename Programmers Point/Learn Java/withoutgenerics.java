import java.util.*;
class Demo
{
public static void main(String aa[])
{
String s1=new String("aaa");
String s2=new String("bbb");
String s3=new String("ccc");

ArrayList al=new ArrayList();
al.add(s1);
al.add(s2);
al.add(s3);

for(Object o:al)
{
String s=(String)o;
System.out.println(s);
}
}
}
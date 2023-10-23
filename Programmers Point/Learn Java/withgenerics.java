import java.util.*;
class Demo
{
public static void main(String aa[])
{
String s1=new String("aaa");
String s2=new String("bbb");
String s3=new String("ccc");

ArrayList<String> al=new ArrayList<String>();
al.add(s1);
al.add(s2);
al.add(s3);

for(String s:al)
{

System.out.println(s);
}
}
}
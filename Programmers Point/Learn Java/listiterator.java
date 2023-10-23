import java.util.*;
class Demo
{
public static void main(String aa[])
{
String s1=new String("aaa");
String s2=new String("bbb");
String s3=new String("ccc");
String s4=new String("ddd");

ArrayList<String> al=new ArrayList<String>();

al.add(s1);
al.add(s2);
al.add(s3);
al.add(s4);


ListIterator it=al.ListIterator();
System.out.println(">>>");
while(it.hasNext())
{
System.out.println(it.next());
}
System.out.println("<<<");
while(it.hasPrevious())
{
System.out.println(it.previous());
}
}
}
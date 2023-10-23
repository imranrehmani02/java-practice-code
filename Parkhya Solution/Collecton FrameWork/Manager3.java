import java.util.ArrayList;
public class Manager3
{
public static void main(String args[])
{
ArrayList list=new ArrayList();
list.add(900);
list.add("Abc");
list.add(99.3);
list.add(true);
System.out.println(list.size());
for(int i=0; i<=list.size(); i++)
{
System.out.println(list.get(i));
}
}
}